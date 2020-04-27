package com.truno.bi.security;

/**
 * Created by alok on 12/29/2017.
 */
import com.truno.bi.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity (securedEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private SecurityService securityService;
    @Autowired
    private AppAuthenticationEntryPoint appAuthenticationEntryPoint;

    // Authentication : User --> Roles
    /*protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.inMemoryAuthentication().withUser("user1").password("secret1")
                .roles("USER");
    }*/
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/**").hasAnyRole("ADMIN","USER")
                .and().httpBasic().realmName("tfbi")
                .authenticationEntryPoint(appAuthenticationEntryPoint);
    }


    // Authorization : Role -> Access
    /*protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests().antMatchers("/receipt*//**")
                .hasRole("USER").antMatchers("*//**").hasRole("ADMIN").and()
                .csrf().disable().headers().frameOptions().disable();
    }*/
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        auth.userDetailsService(securityService).passwordEncoder(passwordEncoder);
    }
}