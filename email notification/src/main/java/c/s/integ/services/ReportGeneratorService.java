package c.s.integ.services;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.jdbc.core.RowCallbackHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import org.springframework.core.io.UrlResource;
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

import org.json.simple.DeserializationException;
import org.json.simple.JsonArray;
import org.json.simple.JsonObject;
import org.json.simple.Jsoner;

// import c.s.integ.edi.dto.SuccessClaimLoadDTO;
// import c.s.integ.edi.dto.FailedClaimLoadDTO;


import java.util.logging.Logger;

//Ref: https://www.callicoder.com/spring-boot-file-upload-download-jpa-hibernate-mysql-database-example/

@Service
public class ReportGeneratorService {

    Logger log = Logger.getLogger(ReportGeneratorService.class.getName());
    
    private final Path fileImportPath;
    private final Path generatedFilePath;

    @Autowired
    public ReportGeneratorService(){
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


    public boolean createXLReport(List<Map<String, Object>> payload, String attName)  {

        LocalDateTime now = LocalDateTime.now();
        String FILE_NAME = "./generated/" + attName + "-" + now.getDayOfMonth() + "-" + now.getMonth() + "-" + now.getYear() + ".xlsx";

        log.info("Creating claim load workbook " + FILE_NAME);

        XSSFWorkbook workbook = new XSSFWorkbook();
            
        //A. SUCCESS
        XSSFSheet successSheet = workbook.createSheet("SUCCESS");        

        Row sHeader = successSheet.createRow(0);
        int i = 0;
        for (String col : payload.get(0).keySet()) {                
            sHeader.createCell(i).setCellValue(col);
            i++;
            }
       
        int rowNum = 1;

        boolean hasData = false;

        try {

            for(Map<String, Object> data : payload){                            
                hasData = true;
                Row row = successSheet.createRow(rowNum++);

                int j = 0;
                for (String col : data.keySet()) {    
                    Cell cel = row.createCell(j);
                    if(col != null && data.get(col) != null){
                        cel.setCellValue(data.get(col).toString());
                        }
                    else{
                        cel.setCellValue("");
                        }                    
                    j++;
                    }                    
                }
        
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();

            } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
            } 
        catch (IOException e) {
            hasData = false;
            e.printStackTrace();
            }
        
        log.info("Done Creating Workbook");
        return hasData;
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
        catch(Exception e){
            log.severe("OOPS !" + e.getMessage());
            return false;
            }        
        }


}