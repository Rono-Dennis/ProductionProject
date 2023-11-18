package c.s.integ.services;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import c.s.integ.db.engine.model.AlertSettings;
import c.s.integ.util.CreateWorksheetCallbackHandler;
import c.s.integ.util.HtmlTableCallbackHandler;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.scheduling.annotation.Async;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import org.springframework.core.io.UrlResource;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ClientInfoStatus;
import java.sql.Types;

import org.json.simple.DeserializationException;
import org.json.simple.JsonArray;
import org.json.simple.JsonObject;
import org.json.simple.Jsoner;


import java.util.logging.Logger;

//Ref: https://www.callicoder.com/spring-boot-file-upload-download-jpa-hibernate-mysql-database-example/

@Service
public class BigReportGeneratorService {

    Logger log = Logger.getLogger(BigReportGeneratorService.class.getName());
    
    private final Path fileImportPath;
    private final Path generatedFilePath;

    @Autowired
    @Qualifier("abacusProdJdbcTemplate")
    private JdbcTemplate abacusProdJdbcTemplate;

    @Autowired
    @Qualifier("integJdbcTemplate")
    private JdbcTemplate integJdbcTemplate;

    @Autowired
    @Qualifier("alertsJdbcTemplate")
    private JdbcTemplate alertsJdbcTemplate;

    @Autowired
    public BigReportGeneratorService(){
        this.fileImportPath = Paths.get("./uploads").toAbsolutePath().normalize();
        this.generatedFilePath = Paths.get("./generated").toAbsolutePath().normalize();
        try {
            Files.createDirectories(this.fileImportPath);
            Files.createDirectories(this.generatedFilePath);
            } 
        catch (Exception ex) {
            log.warning("Could not create the directory where the uploaded files will be stored." + ex.getMessage());
            }
        }



    public String storeFile(MultipartFile file, boolean _isGenerated) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            if(fileName.contains("..")){
                log.warning("Sorry! Filename contains invalid path sequence " + fileName);
                }

            Path targetLocation = null;
            if(_isGenerated){       //if its application generated....
                targetLocation = this.generatedFilePath.resolve(fileName);
                }
            else{
                targetLocation = this.fileImportPath.resolve(fileName);                
                }

            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            return fileName;
            } 
        catch (IOException ex) {
            log.warning("Could not store file." + ex.getMessage());
            return null;
            }

        }


    public Resource loadFileAsResource(String fileName, boolean _isGenerated) {
        
        log.info("downloading " + fileName);
  
        Resource resource = null;
        if(_isGenerated){   
            resource = new FileSystemResource("generated/" + fileName);
            }
        else{
            resource = new ClassPathResource("file_templates/" + fileName);
            }

        if(resource.exists()){
            return resource;
            } 
        else {
            log.info("File not found " + fileName);
            return null;
            }
        }


    public Resource loadReportAsResource(String fileName, boolean _isCompiled) {
    
        log.info("Loading report " + fileName);
    
        Resource resource = resource = new ClassPathResource("file_templates/" + fileName);

        if(resource.exists()) {
            return resource;
            } 
        else {
            log.info("File not found " + fileName);
            return null;
            }

        }


    //public boolean createBigXLReport(List<Map<String, Object>> payload, String attName)  {
    //@Async
    public void createBigXLReport(AlertSettings al) throws Exception {

        log.info("at createBigXLReport...");

        LocalDateTime now = LocalDateTime.now();
        String FILE_NAME = "./generated/" + al.getAttachementName() + "-" + now.getDayOfMonth() + "-" + now.getMonth() + "-" + now.getYear() + ".xlsx";     

        String statusSql = "UPDATE report SET status = ?, status_message = ? WHERE id = ?";


        boolean success = true;

         //if no sql is present just return (will use the static body )
         if(al.getAttachementSql() == null || al.getAttachementSql().equals("") || al.getAttachementSql().isEmpty()){
            log.warning("No attachment sql defined.... returning...");

            // Object[] params = {3, "NO attachment_sql defined. Probably there is a body_sql ..", al.getId()};
            // int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
            // alertsJdbcTemplate.update(statusSql, params, types);

            return; 
            }
        else{
            log.info("QUERY = " + al.getAttachementSql());
            }

    
        try {

            CreateWorksheetCallbackHandler handler = new CreateWorksheetCallbackHandler();
            
            if(al.getDatasource().equals("ABACUS")){
                abacusProdJdbcTemplate.query(al.getAttachementSql(), handler);                     
                }
            else if(al.getDatasource().equals("INTEG")){
                integJdbcTemplate.query(al.getAttachementSql(), handler);                     
                }
            else{
                log.warning("UNKNOWN DATASOURCE: valid values INTEG, ABACUS");
                Object[] params = {3, "UNKNOWN DATASOURCE: valid values INTEG, ABACUS", al.getId()};
                int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
                alertsJdbcTemplate.update(statusSql, params, types);
                //continue;
                //return;
                }                        

            //log.info("after creating handler before getting workbook..");
            XSSFWorkbook wb = handler.getWorkbook();
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            wb.write(outputStream);
            wb.close();

            } 
        catch (DataAccessException dae){
            log.warning("Data Access Exception : " + dae.getMessage());
            Object[] params = {2, dae.getMessage(), al.getId()};
            int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
            alertsJdbcTemplate.update(statusSql, params, types);
            
            }            
        catch (FileNotFoundException fne) {

            log.warning("File Not Found Exception : " + fne.getMessage());
            Object[] params = {3, fne.getMessage(), al.getId()};
            int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
            alertsJdbcTemplate.update(statusSql, params, types);
        
            } 
        catch (IOException ioe) {
            log.warning("IOException : " + ioe.getMessage());
            Object[] params = {3, ioe.getMessage(), al.getId()};
            int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
            alertsJdbcTemplate.update(statusSql, params, types);            
            
            }
        
        //log.info("Done Creating BIG Workbook");
        //return success;
        }



    //CREATE HTML BODY
    //@Async
    public String createHtmlTable(AlertSettings al)  throws Exception {

        log.info("at createHtmlTable...");

        //if no sql is present just return the static
        if(al.getBodySql() == null || al.getBodySql().equals("") || al.getBodySql().trim().equals("0") || al.getBodySql().isEmpty()){
        	String body= "";
        	try {
        		body= al.getBody(); 

        	} catch (Exception e) {
        		System.err.println(e.getMessage());
        	}
        	return body;
        }

        try {

            HtmlTableCallbackHandler handler = new HtmlTableCallbackHandler();
            
            if(al.getDatasource().equals("ABACUS")){
                abacusProdJdbcTemplate.query(al.getBodySql(), handler);                     
                }
            else if(al.getDatasource().equals("INTEG")){
                integJdbcTemplate.query(al.getBodySql(), handler);                     
                }
            else{
                log.warning("UNKNOWN DATASOURCE: valid values INTEG, ABACUS");
                            
                return al.getBody();        //return static body in case of issues
                }                        

            //log.info("after creating handler before getting workbook..");
            return handler.getTablehtml();
            } 
        catch (DataAccessException dae){
            log.warning("Data Access Exception : " + dae.getMessage());
            return al.getBody();        //return static body in case of issues
            }            
        
        //log.info("Done Creating BIG Workbook");
        //return success;
        }

        
    
    public boolean deleteFile(String attName){
        
        LocalDateTime now = LocalDateTime.now();
        String FILE_NAME = "./generated/" + attName + "-" + now.getDayOfMonth() + "-" + now.getMonth() + "-" + now.getYear() + ".xlsx";       
        Path filePath = Paths.get(FILE_NAME).toAbsolutePath().normalize();

        log.info("DELETING file " + FILE_NAME);

        try{
            boolean deleted = Files.deleteIfExists(filePath);   // Surround it in try catch block
            log.info("FILE deleted ? = " + deleted);
            return deleted;
            }
        catch(IOException e){
            log.severe("OOPS !" + e.getMessage());
            return false;
            }        
        }


}