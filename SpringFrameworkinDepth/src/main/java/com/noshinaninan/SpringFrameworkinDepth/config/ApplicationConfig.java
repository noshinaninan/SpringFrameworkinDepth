package com.noshinaninan.SpringFrameworkinDepth.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.noshinaninan.SpringFrameworkinDepth")
@EnableAspectJAutoProxy
public class ApplicationConfig {


}
