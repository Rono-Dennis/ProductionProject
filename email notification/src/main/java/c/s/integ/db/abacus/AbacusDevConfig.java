package c.s.integ.db.abacus;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
  entityManagerFactoryRef = "abacusDevEntityManagerFactory",
  basePackages = { "c.s.integ.db.abacus.dev" }
  )
public class AbacusDevConfig {
 
    @Bean(name = "abacusDevDataSource")
    @ConfigurationProperties(prefix = "abacus.dev.datasource")
    public DataSource dataSource() {
      return DataSourceBuilder.create().build();
      }
  
    @Bean(name = "abacusDevJdbcTemplate")
    public JdbcTemplate abacusDevJdbcTemplate(@Qualifier("abacusDevDataSource") DataSource ds) {
      return new JdbcTemplate(ds);
      }

    @Bean(name = "abacusDevEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean 
    abacusEntityManagerFactory(
      EntityManagerFactoryBuilder builder,
      @Qualifier("abacusDevDataSource") DataSource dataSource
    ) {
      return
        builder
          .dataSource(dataSource)
          .packages("c.s.integ.db.abacus.dev")
          .persistenceUnit("abacus-dev")
          .build();
      }

}