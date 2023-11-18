/**
* Aggressive Cache
* Goes through the database (offset 1000) picking registered members and their accounts.
* These are then loaded on cache permanently..
* This is to avoid hitting the db when checking registration status in the main USSD application.
**/
package c.s.integ.daemon;
import java.lang.Runnable;
import java.math.BigDecimal;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Enumeration;
import java.util.Set;
import java.util.Iterator;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import java.lang.Runnable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.BigDecimal;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.net.URLEncoder;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.json.simple.DeserializationException;
import org.json.simple.JsonArray;
import org.json.simple.JsonObject;
import org.json.simple.Jsoner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.core.env.Environment;

//import c.s.integ.services.ReportGeneratorService;
//import c.s.integ.services.AlertService;
import c.s.integ.interfaces.IAlertService;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.logging.Logger;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import javax.mail.MessagingException;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.dao.EmptyResultDataAccessException;

@Component    //Replaced the @ComponentScan annotation
@EnableScheduling
@Configuration
//@Profile({"onpremise"})
public class AlertsDaemon{

    Logger log = Logger.getLogger(AlertsDaemon.class.getName());

    //http://appsdeveloperblog.com/reading-application-properties-spring-boot/
    @Autowired
    private Environment env;

    @Autowired
    public JavaMailSender emailSender;
    
    @Autowired 
    IAlertService alertService;

    @Autowired
    AlertServiceKE alertServiceKE;

    @Autowired
    @Qualifier("alertsJdbcTemplate")
    private JdbcTemplate engineJdbcTemplate;    
   
    public AlertsDaemon(){
        }


    //For arbitrary testing
//    @Scheduled(cron = "${alerts.adhoc.cron}")
//    @Async
    //@Scheduled(fixedDelay = 60000 * 60 * 60 * 24)
    //@Scheduled(fixedDelay = 1000 * 60 * 60)
    public void testAlerts() {
        alertService.testAlerts();
        }
  
    @Scheduled(cron = "${alerts.hourly.cron}")
    @Async
    public void sendHourlyAlerts() {
//        alertService.sendHourlyAlerts();
        }

    @Scheduled(cron = "${alerts.daily.cron}")
    @Async
    public void sendDailyAlerts() {
        alertService.sendDailyAlerts();
        }

    @Scheduled(cron = "${alerts.daily.cronug}")
    @Async
    public void sendUAPUGAlerts(){
        alertService.sendUAPUGAlerts();
    }

    @Scheduled(cron = "${alerts.daily.cronss}")
    @Async
    public void sendUAPSSAlerts(){
        alertService.sendUAPSSAlerts();
    }

    @Scheduled(cron = "${alerts.daily.cronke}")
//    @Scheduled(cron = "0 34 6 * * *")
    @Async
    public void sendUAPKEAlerts(){
        alertServiceKE.sendUAPKEAlerts();
//        alertService.sendUAPKEAlerts();
    }

    @Scheduled(cron = "${alerts.weekly.cron}")
    @Async
    public void sendWeeklyAlerts() {
//        alertService.sendWeeklyAlerts();
        }

    @Scheduled(cron = "${alerts.monthly.cron}")
    @Async
    public void sendMonthlyAlerts() {
//        alertService.sendMonthlyAlerts();
        }

    
    // public void sendMessageWithAttachment(String to, String subject, String text, String pathToAttachment) {
        
    //     log.info("Sending email with attachement");

    //     try{
    //         MimeMessage message = emailSender.createMimeMessage();                
    //         MimeMessageHelper helper = new MimeMessageHelper(message, true);
                
    //         helper.setTo(to);
    //         helper.setSubject(subject);
    //         helper.setText(text,true);
    //         helper.setFrom("customerexperience@smartapplicationsgroup.com");
    //         helper.addBcc("mabura.zeguru@gmail.com");
                    
    //         FileSystemResource file = new FileSystemResource(new File(pathToAttachment));

    //         helper.addAttachment("FullClaimsReport.xlsx", file);
            
    //         emailSender.send(message);
    //         log.info("Sent");
    //         }
    //     catch(MessagingException me){
    //         log.warning("Error :" + me.getMessage());
    //         }
        
    //     }
    
}
