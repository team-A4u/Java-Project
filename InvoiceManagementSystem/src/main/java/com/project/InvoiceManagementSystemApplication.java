package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

import com.project.dao.InvoiceImplementation;
import com.project.dao.InvoiceInterface;

@EnableDiscoveryClient
@SpringBootApplication

public class InvoiceManagementSystemApplication {

	public static void main(String[] args) {
		ApplicationContext ctc = SpringApplication.run(AppConfiguration.class, args);
		//InvoiceInterface obj = ctc.getBean(InvoiceImplementation.class);
		//obj.createInvoice(101, 111, "mobile", 15000,false);
	}

}
