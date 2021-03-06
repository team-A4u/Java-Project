package com.project.main;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan({"com.project"})
@EnableAutoConfiguration
public class AppConfig 
{
	@Bean
	public DataSource mysqlDataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/coms");
		dataSource.setUsername("root");
		dataSource.setPassword("shubhamsingh");
		
		return dataSource;
	}
}
