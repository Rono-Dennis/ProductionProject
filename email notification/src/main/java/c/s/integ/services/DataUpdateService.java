package c.s.integ.services;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

import java.util.ArrayList;
import java.util.Random;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Types;
import java.time.LocalDate;
import java.time.*;
import java.util.Date;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Enumeration;
import java.util.Set;
import java.util.Iterator;

import javax.sql.DataSource;

import c.s.integ.services.EmailService;
import c.s.integ.services.ReportGeneratorService;
import c.s.integ.util.CustomRowCallbackHandler;
import c.s.integ.util.DataUpdateCallbackHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.Resource;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

//import c.s.integ.interfaces.IMemberSync;

import org.springframework.context.annotation.ScopedProxyMode;

import org.springframework.ui.Model;
import javax.mail.MessagingException;

import org.springframework.scheduling.annotation.Async;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import org.springframework.core.env.Environment;

import org.json.simple.DeserializationException;
import org.json.simple.JsonArray;
import org.json.simple.JsonObject;
import org.json.simple.Jsoner;
import java.text.SimpleDateFormat;

import java.util.logging.Logger;
//import org.apache.commons.lang.StringUtils;
import org.springframework.web.client.RestTemplate;

import c.s.integ.db.engine.repository.DataUpdateSettingsRepository;

import c.s.integ.db.engine.model.DataUpdateSettings;
import c.s.integ.interfaces.IDataUpdateService;

@Service("dataUpdateService")   //or just dataService
public class DataUpdateService implements IDataUpdateService {

    Logger log = Logger.getLogger(DataUpdateService.class.getName());

    @Autowired
    @Qualifier("abacusProdJdbcTemplate")
    private JdbcTemplate abacusProdJdbcTemplate;

    @Autowired
    @Qualifier("abacusDevJdbcTemplate")
    private JdbcTemplate abacusDevJdbcTemplate;

    @Autowired
    @Qualifier("integJdbcTemplate")
    private JdbcTemplate integJdbcTemplate;

    @Autowired
    @Qualifier("alertsJdbcTemplate")
    private JdbcTemplate alertsJdbcTemplate;
    
    @Autowired
    @Qualifier("parklandsJdbcTemplate")
    private JdbcTemplate parklandsJdbcTemplate;

    @Autowired
    private DataUpdateSettingsRepository dataUpdateSettingsRepo;

    @Autowired
    private ReportGeneratorService reportService;

    @Autowired
    private BigReportGeneratorService bigReportService;

    @Autowired
    private EmailService emailService;

    //http://appsdeveloperblog.com/reading-application-properties-spring-boot/
    @Autowired
    private Environment env;

    List<Map<String, Object>> data = null;
    public DataUpdateService() {         
        }


    @Async
    public void testUpdates() {  
        log.info("..TESTING DATA UPDATES...");
        List<DataUpdateSettings> updates = dataUpdateSettingsRepo.getBigDataUpdateTest();
        log.info("found " + updates.size() + " big update");
        doBigUpdates(updates);
        }

    @Async
    public void sendHourlyUpdates() {  
        log.info("..HOURLY UPDATES...");
        List<DataUpdateSettings> updates = dataUpdateSettingsRepo.getUpdatesByFrequency("@hourly");

        //look for daily at and add them to the above list
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("this hour = " + localDateTime.getHour());
        List<DataUpdateSettings> dailyAt = dataUpdateSettingsRepo.getUpdatesAt("@daily",localDateTime.getHour());

        log.info("Updates before addAll " + updates.size());
        updates.addAll(dailyAt);
        log.info("Updates after addAll " + updates.size());

        doBigUpdates(updates);     
        }


    @Async
    public void sendDailyUpdates() {  
        log.info("..DAILY UPDATES...");
        List<DataUpdateSettings> updates = dataUpdateSettingsRepo.getUpdatesByFrequency("@daily");
        doBigUpdates(updates);
        }
    
    @Async
    public void sendWeeklyUpdates() {  
        log.info("..WEEKLY UPDATES...");
        List<DataUpdateSettings> updates = dataUpdateSettingsRepo.getUpdatesByFrequency("@weekly");
        doBigUpdates(updates);
        }
    
    
    @Async
    public void sendMonthlyUpdates() {  
        log.info("..MONTHLY UPDATES...");
        List<DataUpdateSettings> updates = dataUpdateSettingsRepo.getUpdatesByFrequency("@monthly");
        doBigUpdates(updates);
        }

            
    @Async
    public void doBigUpdates(List<DataUpdateSettings> updates) {

        log.info("at doBigUpdates()...");

        for(DataUpdateSettings upd: updates){
            
            //a. create attachment
            String statusSql = "UPDATE data_updates SET status = ?, status_message = ? WHERE id = ?";
            
            try {
            
                log.info("\n=====WORKING ON data_update. id = " + upd.getId() + ", subject = " +upd.getSubject() + " \n");

                doUpdate(upd);
                
                //Update successfull vs total
                Object[] params = {1, LocalDateTime.now().toString(), upd.getId()};
                int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
                alertsJdbcTemplate.update(statusSql, params, types);
                
                }
            
            catch (DataAccessException dae){
                log.warning("Data Access Exception : " + dae.getMessage());
                Object[] params = {2, dae.getMessage(), upd.getId()};
                int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
                alertsJdbcTemplate.update(statusSql, params, types);   
                
                //emailService.sendMessageWithAttachment(recepient, subject, body, al.getAttachementName());
                String body = "Dear Smart Engineer, " 
                            + "<br /><br />Your query below failed to execute successfuly : "
                            + "<br /><br />" + upd.getDataSql() 
                            + "<br /><br /><strong>Source: " + upd.getDatasource() + ", Destination: " + upd.getDestDatasource() + "</strong>"
                            + "<br /><br /><strong>ERROR MESSAGE: " + dae.getMessage() + "</strong>";

                try {
                    emailService.sendEmail(upd.getRecepients(), "ERROR :: DATA UPDATE QUERY : " + upd.getSubject(), body);
                    log.info("Sent error email ");
                    }
                catch(MessagingException me){
                    log.warning("Could not send error email :" + me.getMessage());
                    }

                }     

        // catch (IOException ioe) {
        //     log.warning("IOException : " + ioe.getMessage());
        //     // Object[] params = {3, ioe.getMessage(), al.getId()};
        //     // int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
        //     // alertsJdbcTemplate.update(statusSql, params, types);                        
        //     }
                       
            }
            
        } 
                
    

    @Async
    public void doUpdate(DataUpdateSettings upd) throws DataAccessException{

        //log.info("Doing the update..." + upd.getSubject());

        boolean success = true;

         //if no sql is present just return (will use the static body )
         if(upd.getDataSql() == null || upd.getDataSql().equals("") || upd.getDataSql().isEmpty()){
            log.info("No SQL defined.... returning...");
            return; 
            }
        else{
            log.info("QUERY = " + upd.getDataSql());
            }
        
        //try {

            //1. confirm DESTINATION
            JdbcTemplate dest = abacusDevJdbcTemplate;

            log.info("DESTINATION dataSource = " + upd.getDestDatasource());

            if(upd.getDestDatasource().equals("ABACUS")){
                dest = abacusProdJdbcTemplate;                     
                }
            else if(upd.getDestDatasource().equals("ABACUS_DEV")){
                dest = abacusDevJdbcTemplate;                     
                }
            // else if(upd.getDestDatasource().equals("ABACUS_QA")){
            //     dest = parklandsJdbcTemplate;                     
            //     }
            else if(upd.getDestDatasource().equals("INTEG")){
                dest = integJdbcTemplate ;                     
                }
            else{
                log.warning("UNKNOWN DESTINATION DATASOURCE: valid values ABACUS, INTEG, ABACUS-DEV, ABACUS-QA");
                // Object[] params = {3, "UNKNOWN DATASOURCE: valid values INTEG, ABACUS", upd.getId()};
                // int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
                // alertsJdbcTemplate.updacontinue;
                //return;
                }         

            DataUpdateCallbackHandler handler = new DataUpdateCallbackHandler(dest,upd);
            

            //2. confirm SOURCE
            log.info("SOURCE dataSource = " + upd.getDatasource());
            

            if(upd.getDatasource().equals("ABACUS")){
                abacusProdJdbcTemplate.query(upd.getDataSql(), handler);                     
                }
            else if(upd.getDatasource().equals("ABACUS_DEV")){
                abacusDevJdbcTemplate.query(upd.getDataSql(), handler);                     
                }
            else if(upd.getDatasource().equals("INTEG")){
                integJdbcTemplate.query(upd.getDataSql(), handler);                     
                }
            // else if(upd.getDatasource().equals("RESO")){
            //     integJdbcTemplate.query(upd.getDataSql(), handler);                     
            //     }
            else if(upd.getDatasource().equals("AKUH_PARKLANDS")){
                parklandsJdbcTemplate.query(upd.getDataSql(), handler);                     
                }
            else{
                log.warning("UNKNOWN DATASOURCE: valid values INTEG, ABACUS");
                // Object[] params = {3, "UNKNOWN DATASOURCE: valid values INTEG, ABACUS", al.getId()};
                // int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
                // alertsJdbcTemplate.update(statusSql, params, types);
                }                        


        //     } 
        // catch (DataAccessException dae){
        //     log.warning("Data Access Exception : " + dae.getMessage());
        //     // Object[] params = {2, dae.getMessage(), al.getId()};
        //     // int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
        //     // alertsJdbcTemplate.update(statusSql, params, types);
            
        //     }                   
        // catch (IOException ioe) {
        //     log.warning("IOException : " + ioe.getMessage());
        //     // Object[] params = {3, ioe.getMessage(), al.getId()};
        //     // int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
        //     // alertsJdbcTemplate.update(statusSql, params, types);                        
        //     }

        }


                
}
