// import org.springframework.context.annotation.Configuration;

// import c.s.integ.edi.service.EDIService;
// import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
// import org.springframework.boot.web.client.RestTemplateBuilder;
// import org.springframework.boot.test.web.client.TestRestTemplate;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
// import org.springframework.test.context.ActiveProfiles;

// import org.springframework.context.annotation.Bean;
// import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
// import org.springframework.boot.web.servlet.server.ServletWebServerFactory;

// @Configuration
// @ActiveProfiles("test")
// //@SpringBootApplication(scanBasePackages = {"com.example.joy"})
// //@EnableAutoConfiguration
// public class TestConfiguration {

//     @Autowired
//     EDIService ediService;
    
//     // @Bean 
//     //     ServletWebServerFactory servletWebServerFactory(){
//     //     return new TomcatServletWebServerFactory();
//     //     }
//     // @Bean
//     // @Primary
//     // public NameService nameService() {
//     //     return Mockito.mock(NameService.class);
//     // }

//     // @Bean
//     // public TestRestTemplate testRestTemplate(RestTemplateBuilder builder) {
//     //     return (TestRestTemplate)builder.build();
//     // }
    
//     // @Bean
//     // @Primary
//     // public EDIService ediService() {
//     //     return Mockito.mock(EDIService.class);
//     // }

// }