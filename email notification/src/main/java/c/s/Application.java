package c.s;

import java.util.Properties;
import java.util.logging.Logger;
//use slf4j

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCaching
@EnableScheduling
@EnableAsync

//@EnableConfigServer
public class Application {

    Logger log = Logger.getLogger(Application.class.getName());    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
        .setConnectTimeout(1000 * 10)       //10 seconds
        .setReadTimeout(1000 * 30)
        .build();
    }
    
    // @Bean
    // public RedisConnectionFactory redisConnectionFactory() {
    //     JedisPoolConfig poolConfig = new JedisPoolConfig();
    //     poolConfig.setMaxTotal(5);
    //     poolConfig.setTestOnBorrow(true);
    //     poolConfig.setTestOnReturn(true);
        
    //     JedisConnectionFactory connectionFactory = new JedisConnectionFactory(poolConfig);
    //     connectionFactory.setUsePool(true);
    //     connectionFactory.setHostName("192.180.3.76");
    //     //connectionFactory.setHostName("localhost");
    //     connectionFactory.setPort(6379);
        
    //     return connectionFactory;
    // }


    // @Bean
    // public RedisTemplate<String, Object> redisTemplate() {
    //     RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
    //     redisTemplate.setConnectionFactory(redisConnectionFactory());
    //     redisTemplate.setKeySerializer(new StringRedisSerializer());
    //     redisTemplate.setHashKeySerializer(new StringRedisSerializer());
    //     return redisTemplate;
    //     }


    // @Bean
    // public StringRedisTemplate stringRedisTemplate() {
    //     StringRedisTemplate stringRedisTemplate = new StringRedisTemplate(redisConnectionFactory());
    //     stringRedisTemplate.setEnableTransactionSupport(true);        
    //     stringRedisTemplate.setKeySerializer(new StringRedisSerializer());
    //     stringRedisTemplate.setHashKeySerializer(new StringRedisSerializer());
    //     return stringRedisTemplate;
    //     }	


    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        Properties mailProperties = new Properties();
        mailProperties.put("mail.smtp.auth", "true");
        mailProperties.put("mail.smtp.starttls.enable", "true");
        mailSender.setJavaMailProperties(mailProperties);
        //mailSender.setHost("smtp.gmail.com");
        mailSender.setHost("smtp.office365.com");
        mailSender.setPort(587);
        mailSender.setProtocol("smtp");
        mailSender.setUsername("noreply@smartapplicationsgroup.com");
        mailSender.setPassword("Qaj88432");
        return mailSender;
        }
    
}
