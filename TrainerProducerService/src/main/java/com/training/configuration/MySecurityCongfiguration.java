//package com.training.configuration;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class MySecurityCongfiguration extends WebSecurityConfigurerAdapter {
//	public void configure(HttpSecurity httpSecurity) throws Exception
//	{
//	httpSecurity
//	.authorizeRequests()
//	.antMatchers("/trainer/api/gettrainer")
//	.hasRole("USER")
//	.anyRequest()
//	.authenticated()
//	.and()
//	.formLogin();
//	httpSecurity.csrf().disable();
//	}
//	
////	public void configure(AuthenticationManagerBuilder auth) throws Exception
////    {
////    auth
////    .inMemoryAuthentication()
////    .withUser("userone")
////    .password("{noop}userone")
////    .roles("USER")
////    .and()
////    .withUser("admin")
////    .password("{noop}admin")
////    .roles("ADMIN");
////    }
//
//	
//}
