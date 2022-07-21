package com.mymobileservice;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mymobileservice.data.AccountRepository;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner{
	
	@Autowired
	AccountRepository repo;
	
	private static final Logger logger = Logger.getLogger(BackendApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("App Started");
		logger.error(repo.findAll());
		
	}

}
