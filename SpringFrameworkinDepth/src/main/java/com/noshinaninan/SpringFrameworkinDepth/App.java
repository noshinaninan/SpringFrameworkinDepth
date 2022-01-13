package com.noshinaninan.SpringFrameworkinDepth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.noshinaninan.SpringFrameworkinDepth.config.ApplicationConfig;
import com.noshinaninan.SpringFrameworkinDepth.service.OutputService;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main(String[] args) throws Exception {
	        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	        OutputService outputService = context.getBean(OutputService.class);

	        for (int i=0;i<5;i++){
	            outputService.generateOutput();
	            Thread.sleep(5000);
	        }
	    }
	}
