package c.s.docs;

import javax.net.ssl.SSLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import c.s.docs.service.ClaimsInvLines;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import reactor.netty.http.client.HttpClient;

@SpringBootApplication
public class DocsIntegrationApplication {
	private static ConfigurableApplicationContext context;


    public static void main(String[] args) {
        context = SpringApplication.run(DocsIntegrationApplication.class, args);        
    }
    
    public static void restart() {
    	ApplicationArguments args= context.getBean(ApplicationArguments.class);
    	
    	Thread thread =  new Thread(() -> {
    		context.close();
    		context = SpringApplication.run(DocsIntegrationApplication.class, args.getSourceArgs());
    	});
    	
    	thread.setDaemon(false);
    	thread.start();
    }

}
