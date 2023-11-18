package c.s.integ.services;

import java.util.Map;
import java.util.List;

import java.sql.Types;
import java.time.*;

import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

//import c.s.integ.interfaces.IMemberSync;

import javax.mail.MessagingException;

import org.springframework.scheduling.annotation.Async;

import org.springframework.core.env.Environment;

import java.util.logging.Logger;
//import org.apache.commons.lang.StringUtils;
import org.springframework.web.client.RestTemplate;

import c.s.integ.db.engine.repository.AlertSettingsRepository;

import c.s.integ.db.engine.model.AlertSettings;
import c.s.integ.interfaces.IAlertService;

@Service("alertService")
public class AlertService implements IAlertService {

    Logger log = Logger.getLogger(AlertService.class.getName());

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
    private RestTemplate restTemplate;    


    @Autowired
    private AlertSettingsRepository alertSettingsRepo;


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
    public AlertService() {         
        }


//    @Async
    public void testAlerts() {  
        log.info("..TESTING BIG ALERTS...");
        List<AlertSettings> alerts = alertSettingsRepo.getBigAlertTest();
        log.info("found " + alerts.size() + " big alerts");
//        doBigAlerts(alerts);
        //sendAlerts(alerts);   
        }

    @Async
    public void sendHourlyAlerts() {  
        /*log.info("..HOURLY ALERTS...");
        List<AlertSettings> alerts = alertSettingsRepo.getAlertsByFrequency("@hourly");

        //look for daily at and add them to the above list
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("this hour = " + localDateTime.getHour());
        List<AlertSettings> dailyAt = alertSettingsRepo.getAlertsAt("@daily",localDateTime.getHour());

        log.info("Alerts before addAll " + alerts.size());
        alerts.addAll(dailyAt);
        log.info("Alerts after addAll " + alerts.size());

        //sendAlerts(alerts);   
        doBigAlerts(alerts);   */
        }

    @Async
    public void sendDailyAlerts() {  
       /* log.info("..DAILY ALERTS...");
//        List<AlertSettings> alerts = alertSettingsRepo.getAlertsByFrequency("@daily");
//        String subject = "EXCEPTIONAL ALERTS CLAIMS OLD MUTUAL SS";
        String subject1 = "EXCEPTIONAL ALERTS CLAIMS OLD MUTUAL UG";
        Integer id =0;
        List<AlertSettings> Alerts = alertSettingsRepo.getAlertsBySubject(subject1);
        for (AlertSettings alertSettings: Alerts){
            alertSettings.getRecepients();
            log.info("recipients "+ alertSettings.getRecepients());
        }
        log.info("alerts size is "+ Alerts.size());
//        List<AlertSettings> alerts = alertSettingsRepo.getAlertsByFrequencyAnsSubject("@daily",subject1);
        //sendAlerts(alerts);
//        doBigAlerts(Alerts);*/
        }
    
    @Async
    public void sendWeeklyAlerts() {  
        log.info("..WEEKLY ALERTS...");
        List<AlertSettings> alerts = alertSettingsRepo.getAlertsByFrequency("@weekly");
        //sendAlerts(alerts);
//        doBigAlerts(alerts);
        }
    
    
    @Async
    public void sendMonthlyAlerts() {  
        log.info("..MONTHLY ALERTS...");
        List<AlertSettings> alerts = alertSettingsRepo.getAlertsByFrequency("@monthly");
        //sendAlerts(alerts);
//        doBigAlerts(alerts);
        }

    @Override
    public void sendUAPSSAlerts() {
        log.info("..EXCEPTIONAL ALERTS SS...");
        String subjectSS = "EXCEPTIONAL ALERTS CLAIMS OLD MUTUAL SS";
        Integer id = 750;
        List<AlertSettings> Alerts = alertSettingsRepo.getAlertsByIdAndSubject(id,subjectSS);
        for (AlertSettings alertSettings: Alerts){
            alertSettings.getRecepients();
            log.info("recipients "+ alertSettings.getRecepients());
        }
        log.info("alerts size is "+ Alerts.size());
        doBigAlerts(Alerts);
    }

    @Override
    public void sendUAPKEAlerts() {
        log.info("..EXCEPTIONAL ALERTS KE...");
        String subjectKe = "EXCEPTIONAL ALERTS CLAIMS UAP";
        Integer id =135;
        List<AlertSettings> Alerts = alertSettingsRepo.getAlertsByIdAndSubject(id, subjectKe);
        for (AlertSettings alertSettings: Alerts){
            alertSettings.getRecepients();
            log.info("recipients "+ alertSettings.getRecepients());
        }
        log.info("alerts size is "+ Alerts.size());
        doBigAlerts(Alerts);
    }

    @Override
    public void sendUAPUGAlerts() {
        log.info("..EXCEPTIONAL ALERTS UG...");
        String subjectSS = "EXCEPTIONAL ALERTS CLAIMS OLD MUTUAL UG";
        Integer id = 751;
        List<AlertSettings> Alerts = alertSettingsRepo.getAlertsByIdAndSubject(id,subjectSS);
        for (AlertSettings alertSettings: Alerts){
            alertSettings.getRecepients();
            log.info("recipients "+ alertSettings.getRecepients());
        }
        log.info("alerts size is "+ Alerts.size());
        doBigAlerts(Alerts);
    }

    //    @Async
    public void doBigAlerts(List<AlertSettings> alerts) {

        log.info("at doBigAlerts()...");

        boolean hasData = false;
        for(AlertSettings al: alerts){
        	reportService.deleteFile(al.getAttachementName());
            
            //a. create attachment
            log.info("CREATING big attachment " + al.getAttachementName());
            try {
				bigReportService.createBigXLReport(al);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            //b. send email
            log.info("PREPARING to send email to " + al.getRecepients());
            
            String recepient = al.getRecepients();// "dennis.rono@smartapplicationsgroup.com";
//                    al.getRecepients();
            String subject = al.getSubject();
            String body = null;
			try {
				body = bigReportService.createHtmlTable(al);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

//            log.info("EMAIL BODY =" + body);

            String statusSql = "UPDATE report SET status = ?, status_message = ? WHERE id = ?";

            try {

                //if no sql is present just return the static
            	Boolean send_status=false;
                if(al.getAttachementSql() == null || al.getAttachementSql().equals("") || al.getAttachementSql().isEmpty()){
                	send_status = emailService.sendEmail(recepient, subject, body);
                    }
                else{
                	send_status = emailService.sendMessageWithAttachment(recepient, subject, body, al.getAttachementName());
                    }
                int alertStatus=0;
                String alertStatusMessage="";
                if(send_status) {
                	alertStatus=1;
                	alertStatusMessage="Alert Sent Successfully at "+LocalDateTime.now().toString();
                }else {
                	alertStatus=2;
                	alertStatusMessage="Alert failed at "+LocalDateTime.now().toString();
                }

                Object[] params = {alertStatus, alertStatusMessage, al.getId()};
                int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
                alertsJdbcTemplate.update(statusSql, params, types);

                //d. remove xl file
//                reportService.deleteFile(al.getAttachementName());
                
                }
            catch(MessagingException me){
                Object[] params = {3, me.getMessage(), al.getId()};
                int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
                alertsJdbcTemplate.update(statusSql, params, types);
                }
            

                
            }
            
        } 
                
    @Async
    public void sendAlerts(List<AlertSettings> alerts) {          
        
        for(AlertSettings al : alerts){            
            
            log.info("FOUND alert. id = " + al.getId() + ", subject = " + al.getSubject() + ", recepients = " + al.getRecepients() + ", datasource = " + al.getDatasource() + " ");            
          
            String statusSql = "UPDATE report SET status = ?, status_message = ? WHERE id = ?";
            try{

                if(al.getDatasource().equals("ABACUS")){
                    data = abacusProdJdbcTemplate.queryForList(al.getAttachementSql());
                    log.info("DATA size = " + data.size());                
                    }
                else if(al.getDatasource().equals("INTEG")){
                    data = integJdbcTemplate.queryForList(al.getAttachementSql());
                    log.info("DATA size = " + data.size());
                    }
                else{
                    log.warning("UNKNOWN DATASOURCE: valid values INTEG, ABACUS");
                    Object[] params = {3, "UNKNOWN DATASOURCE: valid values INTEG, ABACUS", al.getId()};
                    int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
                    alertsJdbcTemplate.update(statusSql, params, types);
                    continue;
                    }              
                }
            catch (InvalidResultSetAccessException ire) {
                log.warning("Invalid ResultsetAccess Exception : " + ire.getMessage());
                Object[] params = {2, ire.getMessage(), al.getId()};
                int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
                alertsJdbcTemplate.update(statusSql, params, types);
                continue;
                } 
            catch (DataAccessException dae){
                log.warning("Data Access Exception : " + dae.getMessage());
                Object[] params = {2, dae.getMessage(), al.getId()};
                int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
                alertsJdbcTemplate.update(statusSql, params, types);


                String body = "Dear Smart Engineer, " 
                            + "<br /><br />Your query below failed to execute successfuly : "
                            + "<br /><br />" + al.getAttachementSql()
                            + "<br /><br /><strong>Data Source: " + al.getDatasource() +  "</strong>"
                            + "<br /><br /><strong>ERROR MESSAGE: " + dae.getMessage() + "</strong>";

                try {
                    emailService.sendEmail(al.getRecepients(), "ERROR :: ALERT QUERY: " + al.getSubject(), body);
                    log.info("Sent error email ");
                    }
                catch(MessagingException me){
                    log.warning("Could not send error email :" + me.getMessage());
                    }
                    

                continue;
                }
 
             
            if(data != null && data.size()>0){                
                //a. create attachment
                log.info("CREATING attachment " + al.getAttachementName());
                reportService.createXLReport(data, al.getAttachementName());

                //b. send email
                log.info("SENDING email to " + al.getRecepients());

                String recepient = al.getRecepients();
                String subject = al.getSubject();
                //String body = al.getBody();
                String body = null;
				try {
					body = bigReportService.createHtmlTable(al);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

               
                //c. update alert status (update picked to 2 and send_time)
                try{
                    emailService.sendMessageWithAttachment(recepient, subject, body, al.getAttachementName());
                    
                    Object[] params = {1, LocalDateTime.now().toString(), al.getId()};
                    int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
                    alertsJdbcTemplate.update(statusSql, params, types);

                    //d. remove xl file
                    reportService.deleteFile(al.getAttachementName());
                    }
                catch(MessagingException me){
                    Object[] params = {3, me.getMessage(), al.getId()};
                    int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
                    alertsJdbcTemplate.update(statusSql, params, types);
                    continue;
                    }
                
                }
            else{   //no data 
                Object[] params = {4, "NO DATA", al.getId()};
                int[] types = {Types.SMALLINT, Types.VARCHAR, Types.BIGINT};            
                alertsJdbcTemplate.update(statusSql, params, types);
                continue;
                }

            }
        
        //return true;
        }
    
                
}
