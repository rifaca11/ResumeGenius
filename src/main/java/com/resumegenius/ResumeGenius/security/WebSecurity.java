package com.resumegenius.ResumeGenius.security;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurity  {
@Bean
 public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
            .csrf().disable()
            .authorizeHttpRequests()
            .requestMatchers("/users/**")
            .permitAll()
            .anyRequest()
            .authenticated();
    return http.build();
}
}
