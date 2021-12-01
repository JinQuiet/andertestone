/*
ApplicationConfig.java is the configuration metadata Spring will use to instantiate the container
*/

package com.andersen;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan("com.andersen")
public class ApplicationConfig {

}
