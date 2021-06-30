package com.intellia.orgmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class OrgManagementApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(OrgManagementApplication.class, args);
		
		System.out.println("started...");
	}

}
