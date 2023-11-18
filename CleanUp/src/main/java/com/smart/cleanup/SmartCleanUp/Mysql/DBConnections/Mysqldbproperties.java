package com.smart.cleanup.SmartCleanUp.Mysql.DBConnections;


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
        basePackages = "com.smart.cleanup.SmartCleanUp.Mysql.MysqlRepo",
        entityManagerFactoryRef = "mysqlEntityManager",
        transactionManagerRef = "mysqlTransactionManager"
)
public class Mysqldbproperties {

    private final Environment env;

    public Mysqldbproperties(Environment env) {
        this.env = env;
    }


    @Bean
    public LocalContainerEntityManagerFactoryBean mysqlEntityManager() {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(mysqlDataSource());
        em.setPackagesToScan(
                "com.smart.cleanup.SmartCleanUp.Mysql.MysqlModel");

        HibernateJpaVendorAdapter vendorAdapter
                = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", "none");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        em.setJpaPropertyMap(properties);

        return em;
    }

    @Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource
                = new DriverManagerDataSource();
        dataSource.setDriverClassName(
                Objects.requireNonNull(env.getProperty("mysql.driver-class-name")));
        dataSource.setUrl(env.getProperty("jdbc.mysql.url"));
        dataSource.setUsername(env.getProperty("jdbc.mysql.username"));
        dataSource.setPassword(env.getProperty("jdbc.mysql.password"));
        return dataSource;
    }

    @Bean
    public PlatformTransactionManager mysqlTransactionManager() {
        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                mysqlEntityManager().getObject());
        return transactionManager;
    }
}
