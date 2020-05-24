//Todo custom login page
package com.todo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("1234").roles("USER");
		auth.inMemoryAuthentication().withUser("user1").password("1234").roles("USER");
	}

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests()
		.antMatchers("/", "/*todo*/**").access("hasRole('USER')").and()
		.formLogin().permitAll().and()
		.logout()
			.logoutUrl("/logout1")
			.logoutSuccessUrl("/login1")
		.and()
        	.csrf().disable();
/*
        .loginPage("/login")
        .permitAll()
        .and()
    .logout()                                    
        .permitAll();*/
	}
	
	@Bean
	public CustomLogoutHandler customLogoutHandler() {
	    return new CustomLogoutHandler();
	}
}