package com.gebeya.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {

		
		ApplicationContext applicationContext = SpringApplication.run(DiApplication.class, args);
		//Peacock peacock = applicationContext.getBean(Peacock.class);

		//System.out.println(peacock.getSpecies());
	}

}
