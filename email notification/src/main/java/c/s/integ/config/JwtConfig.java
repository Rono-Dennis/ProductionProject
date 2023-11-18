// package c.s.alerts.config;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.http.HttpMethod;
// //import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// //import org.springframework.security.config.annotation.web.builders.HttpSecurity;


// import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.http.HttpMethod;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// //import org.springframework.security.oauth2.jwt.JwtDecoder;
// //import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;

// @Configuration
// public class JwtConfig extends WebSecurityConfigurerAdapter {
 
//     @Override
//     protected void configure(HttpSecurity http) throws Exception {
//         http.cors()
//             .and()
//               .authorizeRequests()
//                 .antMatchers(HttpMethod.GET, "/whoami", "/test/**")
//                   .hasAuthority("SCOPE_read")
//                 .antMatchers(HttpMethod.POST, "/user/info")
//                   .hasAuthority("SCOPE_write")
//                 .anyRequest()
//                   .authenticated()
//             .and()
//               .oauth2ResourceServer()
//                 .jwt();
//     }

//     // @Bean
// 	// JwtDecoder jwtDecoder(OAuth2ResourceServerProperties properties) {
// 	// 	NimbusJwtDecoder jwtDecoder = NimbusJwtDecoder.withJwkSetUri(properties.getJwt().getJwkSetUri()).build();
// 	// 	jwtDecoder.setClaimSetConverter(new OrganizationSubclaimAdapter());
// 	// 	return jwtDecoder;
//     //     }

// }