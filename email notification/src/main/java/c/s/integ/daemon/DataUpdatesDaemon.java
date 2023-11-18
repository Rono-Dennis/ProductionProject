/**
* 
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
import c.s.integ.interfaces.IDataUpdateService;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.logging.Logger;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import javax.mail.MessagingException;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.dao.EmptyResultDataAccessException;

@Component    //Replaced the @ComponentScan annotation
@EnableScheduling
//@Profile({"onpremise"})
public class DataUpdatesDaemon{

    Logger log = Logger.getLogger(DataUpdatesDaemon.class.getName());

    //http://appsdeveloperblog.com/reading-application-properties-spring-boot/
    @Autowired
    private Environment env;

    @Autowired
    public JavaMailSender emailSender;
    
    @Autowired 
    IDataUpdateService updateService;

    @Autowired
    @Qualifier("alertsJdbcTemplate")
    private JdbcTemplate engineJdbcTemplate;    
   
    public DataUpdatesDaemon(){
        }


    //For arbitrary testing
    //@Scheduled(cron = "${updates.adhoc.cron}")
    //@Scheduled(fixedDelay = 60000 * 60 * 60 * 24)
    //@Scheduled(fixedDelay = 1000 * 60 * 60 )
    public void testAlerts() {
        updateService.testUpdates();
        }
  
    @Scheduled(cron = "${updates.hourly.cron}")
    public void sendHourlyAlerts() {
//        updateService.sendHourlyUpdates();
        }

    @Scheduled(cron = "${updates.daily.cron}")
    public void sendDailyAlerts() {
//        updateService.sendDailyUpdates();
        }

    @Scheduled(cron = "${updates.weekly.cron}")
    public void sendWeeklyAlerts() {
//        updateService.sendWeeklyUpdates();
        }

    @Scheduled(cron = "${updates.monthly.cron}")
    public void sendMonthlyAlerts() {
//        updateService.sendMonthlyUpdates();
        }

    
}
