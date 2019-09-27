package com.onet.solutions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.thymeleaf.dialect.springdata.SpringDataDialect;

import com.onet.solutions.controller.AddressController;

@SpringBootApplication
@EnableJpaAuditing
public class SmartAppApplication {
	
	public static final Logger log = LoggerFactory.getLogger(SmartAppApplication.class);

	public static void main(String[] args) {
		// test
		log.debug("debug");
		log.info("info");
		
		SpringApplication.run(SmartAppApplication.class, args);
	}
	


	@Bean
	public SpringDataDialect springDataDialect() {
		return new SpringDataDialect();
	}
}
