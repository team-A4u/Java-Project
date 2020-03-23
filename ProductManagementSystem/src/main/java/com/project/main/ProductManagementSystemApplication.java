package com.project.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductManagementSystemApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(AppConfig.class, args);
	}
}
