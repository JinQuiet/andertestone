/*
ApplicationConfig.java is the configuration metadata Spring will use to instantiate the container
*/

package com.andersen;

import java.util.Arrays;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan("com.andersen")
public class ApplicationConfig {

    @Bean
    public FilterRegistrationBean<LoggingFilter> loggingFilterRegistrationBean(){
      
      FilterRegistrationBean<LoggingFilter> registration = new FilterRegistrationBean<>();
      
      LoggingFilter filter = new LoggingFilter();
      registration.setFilter(filter);
      registration.setOrder(Integer.MAX_VALUE);
      registration.setUrlPatterns(Arrays.asList("/*"));
      
      return registration;    
    }
}
