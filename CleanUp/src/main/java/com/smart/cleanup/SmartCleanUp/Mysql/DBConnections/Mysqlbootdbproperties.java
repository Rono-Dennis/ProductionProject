package com.smart.cleanup.SmartCleanUp.Mysql.DBConnections;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
@PropertySource({ "classpath:persistence-smart-boot.properties" })
@EnableJpaRepositories(
        basePackages = "com.smart.cleanup.SmartCleanUp.Mysql.MysqlRepo",
        entityManagerFactoryRef = "mysqlEntityManager",
        transactionManagerRef = "mysqlTransactionManager"
)
public class Mysqlbootdbproperties {

    private final Environment env;

    public Mysqlbootdbproperties(Environment env) {
        this.env = env;
    }


    @Bean
    public LocalContainerEntityManagerFactoryBean mysqlEntityManager() {
        final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(mysqlAutoDataSource());
        em.setPackagesToScan("com.smart.cleanup.SmartCleanUp.Mysql.MysqlModel");

        final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        final HashMap<String, Object> properties = new HashMap<String, Object>();
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect", env.getProperty("hibernate.dialect1"));
        em.setJpaPropertyMap(properties);

        return em;
    }

    @Bean
    public DataSource mysqlAutoDataSource() {
        return DataSourceBuilder.create().build();
    }


    @Bean
    public PlatformTransactionManager mysqlTransactionManager() {
        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(mysqlEntityManager().getObject());
        return transactionManager;
    }
}
