package com.project.order.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.project.order.config.OrderConfig;
//import com.project.order.dao.OrderInterface;

@EnableDiscoveryClient
@EnableWebMvc
@SpringBootApplication
public class OrderManagemnetSystemApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(OrderConfig.class, args);
//ApplicationContext context=
//	
//		OrderInterface refOrderInterface=context.getBean(OrderInterface.class);
//		refOrderInterface.insertOrder(1, 101, "thd", 123, "ytjdy", 65);
	}

}
