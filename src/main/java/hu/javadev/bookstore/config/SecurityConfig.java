package hu.javadev.bookstore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .formLogin() //
                .loginPage("/login") //
                .loginProcessingUrl("/spring_security_check") //
                .usernameParameter("username") //
                .passwordParameter("password") //
            .and() //
            .logout() //
                .logoutUrl("/logout") //
            .and() //
            .authorizeRequests() //
                .antMatchers("/addBook").hasRole("ADMIN") //
                .anyRequest().permitAll();
    }
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication() //
                .withUser("user") //
                    .password("1234") //
                    .roles("USER") //
            .and() //
                .withUser("admin") //
                    .password("password") //
                    .roles("USER", "ADMIN");
    }

}
