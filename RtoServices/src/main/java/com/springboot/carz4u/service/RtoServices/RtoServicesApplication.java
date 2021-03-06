package com.springboot.carz4u.service.RtoServices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RtoServicesApplication {

	private static final Logger log = LoggerFactory.getLogger(RtoServicesApplication.class);
	
	public static void main(String[] args) {
		log.info("Start {} Class, main method.",log.getName(),log.getClass());
		SpringApplication.run(RtoServicesApplication.class, args);
		log.info("End {} Class, main method.",log.getName(),log.getClass());
	}

}
