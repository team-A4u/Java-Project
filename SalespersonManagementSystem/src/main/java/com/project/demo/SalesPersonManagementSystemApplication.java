 package com.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;




@EnableDiscoveryClient
@SpringBootApplication
public class SalesPersonManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}

}
