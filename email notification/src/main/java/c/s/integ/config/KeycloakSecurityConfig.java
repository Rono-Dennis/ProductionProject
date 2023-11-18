/**
 * 
 * Please note the code above:

    configureGlobal: tasks the SimpleAuthorityMapper to make sure roles are not prefixed with ROLE_
    keycloakConfigResolver: this defines that we want to use the Spring Boot properties file support instead of the default keycloak.json
    WIth this config we dont need keycloak constraints in the properties file instread we use just 'keycloak.principal-attribute=preferred_username'
 * 
 */
package c.s.integ.config;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.keycloak.adapters.springsecurity.KeycloakSecurityComponents;
import org.keycloak.adapters.springsecurity.authentication.KeycloakAuthenticationProvider;
import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.authority.mapping.SimpleAuthorityMapper;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;


@Configuration
@EnableWebSecurity
//@ComponentScan(basePackageClasses = KeycloakSecurityComponents.class)
class KeycloakSecurityConfig extends KeycloakWebSecurityConfigurerAdapter {
 
    @Autowired
    public void configureGlobal(
      AuthenticationManagerBuilder auth) throws Exception {
  
        KeycloakAuthenticationProvider keycloakAuthenticationProvider
         = keycloakAuthenticationProvider();
        keycloakAuthenticationProvider.setGrantedAuthoritiesMapper(
          new SimpleAuthorityMapper());
        auth.authenticationProvider(keycloakAuthenticationProvider);
    }
 
    @Bean
    public KeycloakSpringBootConfigResolver KeycloakConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }
 
    @Bean
    @Override
    protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
        return new RegisterSessionAuthenticationStrategy(
          new SessionRegistryImpl());
    }
 
    //@Override
    // protected void configure(HttpSecurity http) throws Exception {
    //     super.configure(http);
    //     http.authorizeRequests()
    //       .antMatchers("/test/*")
    //       .hasRole("user")
    //       .anyRequest()
    //       .permitAll();
    //     }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    super.configure(http);            
    http.cors()
        .and()
            .authorizeRequests()
            .antMatchers(HttpMethod.GET, "/test/*")
                .hasRole("user")
            .antMatchers(HttpMethod.POST, "/user/info")
                .hasAuthority("SCOPE_write")
            .anyRequest()
                .authenticated()
        .and()
            .oauth2ResourceServer()
            .jwt();
        }

}