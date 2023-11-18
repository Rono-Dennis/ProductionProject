// package c.s.integ.db;

// import javax.persistence.EntityManagerFactory;
// import javax.sql.DataSource;
// import org.springframework.jdbc.core.JdbcTemplate;

// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.boot.jdbc.DataSourceBuilder;
// import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Primary;
// import org.springframework.core.io.ClassPathResource;
// import org.springframework.core.io.Resource;
// import org.springframework.core.io.support.PropertiesLoaderUtils;
// import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// import org.springframework.orm.jpa.JpaTransactionManager;
// import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
// import org.springframework.transaction.PlatformTransactionManager;
// import org.springframework.transaction.annotation.EnableTransactionManagement;

// @Configuration
// @EnableTransactionManagement
// @EnableJpaRepositories(
//   entityManagerFactoryRef = "resoEntityManagerFactory",
//   //transactionManagerRef = "resoTransactionManager",
//   basePackages = { "c.s.integ.alerts.reso" }
//   )
// public class ResoDbConfig {
 
//     @Bean(name = "resoDataSource")
//     @ConfigurationProperties(prefix = "reso.datasource")
//     public DataSource dataSource() {
//       return DataSourceBuilder.create().build();
//       }
  
//     @Bean(name = "resoJdbcTemplate")
//     public JdbcTemplate resoJdbcTemplate(@Qualifier("resoDataSource") DataSource ds) {
//       return new JdbcTemplate(ds);
//       }

//     @Bean(name = "resoEntityManagerFactory")
//     public LocalContainerEntityManagerFactoryBean 
//     resoEntityManagerFactory(
//       EntityManagerFactoryBuilder builder,
//       @Qualifier("resoDataSource") DataSource dataSource
//     ) {
//       return
//         builder
//           .dataSource(dataSource)
//           .packages("c.s.integ.alerts.reso")
//           .persistenceUnit("reso")
//           .build();
//       }


// }