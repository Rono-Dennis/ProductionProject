package com.smart.cleanup.SmartCleanUp.Oracle.DBConnection;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Objects;

@Configuration
@PropertySource({"classpath:smart-db.properties"})
@EnableJpaRepositories(
        basePackages = "com.smart.cleanup.SmartCleanUp.Oracle.SmartRepo",
        entityManagerFactoryRef = "oracleEntityManager",
        transactionManagerRef = "oracleTransactionManager"
)
public class Oracledbproperties {

    private final Environment env;

    public Oracledbproperties(Environment env) {
        this.env = env;
    }


    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean oracleEntityManager() {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(oracleDataSource());
        em.setPackagesToScan(
                "com.smart.cleanup.SmartCleanUp.Oracle.ModelSmart");

        HibernateJpaVendorAdapter vendorAdapter
                = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", "none");
        properties.put("hibernate.show_sql", "false"); 
        properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle12cDialect");
        em.setJpaPropertyMap(properties);

        return em;
    }

    @Bean
    @Primary
    public DataSource oracleDataSource() {
        DriverManagerDataSource dataSource
                = new DriverManagerDataSource();
        dataSource.setDriverClassName(
                Objects.requireNonNull(env.getProperty("jdbc.driverClassName")));
        dataSource.setUrl(env.getProperty("jdbc.smart.url"));
        dataSource.setUsername(env.getProperty("jdbc.smart.username"));
        dataSource.setPassword(env.getProperty("jdbc.smart.password"));
        return dataSource;
    }

    @Bean
    @Primary
    public PlatformTransactionManager oracleTransactionManager() {
        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                oracleEntityManager().getObject());
        return transactionManager;
    }
}
