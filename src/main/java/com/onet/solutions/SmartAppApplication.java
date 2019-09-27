package com.onet.solutions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.thymeleaf.dialect.springdata.SpringDataDialect;

import com.onet.solutions.controller.AddressController;
import com.onet.solutions.dao.CatalogRepository;
import com.onet.solutions.dao.CodeGroupRepository;
import com.onet.solutions.entity.Catalog;
import com.onet.solutions.entity.CodeGroup;

@SpringBootApplication
@EnableJpaAuditing
public class SmartAppApplication implements CommandLineRunner{
	
	public static final Logger log = LoggerFactory.getLogger(SmartAppApplication.class);
	
	   @Autowired
	    private CatalogRepository catalogRepository;
	   @Autowired
	    private CodeGroupRepository codeGroupRepository;


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
	
	@Override
	 public void run(String... args) throws Exception {
	        // Clean up database tables
	      
	        //catalogRepository.deleteAllInBatch();

	        //=========================================

	        // Create a User instance
	        Catalog cat = new Catalog("Rajeev");
	        CodeGroup cg = new CodeGroup("Rajeev");
 


	      
	        // Save Parent Reference (which will save the child as well)
	        catalogRepository.save(cat);
	        codeGroupRepository.save(cg);

	        //=========================================
	    }
	
}
