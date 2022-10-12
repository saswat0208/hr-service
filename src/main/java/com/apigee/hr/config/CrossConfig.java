package com.apigee.hr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class CrossConfig {

    public void addCrossMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowedMethods("GET" , "POST" , "PUT" , "OPTIONS" , "DELETE" , "PATCH")
                .allowCredentials(true);
    }
}
