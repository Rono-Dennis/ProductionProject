package c.s.integ.services;

import java.util.Properties;

import java.time.LocalDateTime;
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

import javax.mail.internet.InternetAddress;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;

import javax.mail.internet.MimeMessage;

import javax.mail.MessagingException;
import java.util.logging.Logger;


//https://www.baeldung.com/spring-email
@Service
public class EmailService {

    Logger log = Logger.getLogger(EmailService.class.getName());    
    
    @Autowired
    public JavaMailSender emailSender; 

//    @Async    
    public Boolean sendEmail(String to, String subject, String text) throws MessagingException {

        log.info("Sending email");
        try{
            MimeMessage message = emailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, false);   //false means not multipart

            helper.setTo(InternetAddress.parse(to));      //allows multiple addresses
            helper.setSubject(subject);
            helper.setText(text,true);      //allow html
            helper.setFrom("noreply@smartapplicationsgroup.com");

            emailSender.send(message);
            log.info("Sent");
            return true;
        }catch (Exception ex){
            log.severe(ex.getMessage());

            return false;
        }
    }

            
    //@Override
//    @Async
    public Boolean sendMessageWithAttachment(String to, String subject, String text, String attachmentName) throws MessagingException {

        LocalDateTime now = LocalDateTime.now();
        String pathToAttachment = "./generated/" + attachmentName + "-" + now.getDayOfMonth() + "-" + now.getMonth() + "-" + now.getYear() + ".xlsx";

        log.info("Sending email with attachement");

        try {
            MimeMessage message = emailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setTo(InternetAddress.parse(to));      //allows multiple addresses
            helper.setSubject(subject);
            helper.setText(text,true);      //allow html
            helper.setFrom("noreply@smartapplicationsgroup.com");
//            helper.addBcc("kenan.muga@smartapplicationsgroup.com");

            FileSystemResource file = new FileSystemResource(new File(pathToAttachment));

            helper.addAttachment(attachmentName + ".xlsx", file);

            emailSender.send(message);
            log.info("Sent");
            return true;
        }catch (Exception ex){
            log.severe(ex.getMessage());
            return false;
        }
    }

}