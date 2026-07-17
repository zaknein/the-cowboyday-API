package com.zaknein.the_cowboyday_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;



@SpringBootApplication
@ConfigurationPropertiesScan
public class TheCowboydayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheCowboydayApiApplication.class, args);
	}

}
