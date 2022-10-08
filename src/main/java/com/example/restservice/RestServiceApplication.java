package com.example.restservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class RestServiceApplication {

	private static Logger logger = LoggerFactory.getLogger(RestServiceApplication.class);
	public static void main(String[] args) {
		try {
			ApplicationContext ctx = SpringApplication.run(RestServiceApplication.class, args);
		    Environment environment = ctx.getEnvironment();
	        logger.info("Greetings Application started successfully !");
	        logger.info(
	          "Application listening on port: {}", environment.getProperty("local.server.port"));
	    } catch (Exception ex) {
	      logger.error("Greetings Application failed :( with exception ---> ", ex);
	      throw new RuntimeException();
	    }

	}

}
