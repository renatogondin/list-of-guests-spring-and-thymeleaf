package com.renato.festa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;


@Configuration
public class InMemorySecurityConfig {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder)
			throws Exception {
		builder
		.inMemoryAuthentication()
		.withUser("renato").password("{noop}123").roles("USER")
		.and()
		.withUser("alexandre").password("{noop}123").roles("USER")
		.and()
		.withUser("thiago").password("{noop}123").roles("USER");
	}
}