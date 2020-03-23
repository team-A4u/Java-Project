package com.project.customer;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.project.config.CustomerConfig;

import javax.sql.DataSource;



@EnableAutoConfiguration
@Configuration
//@ComponentScan("com.example")
//@PropertySource("classpath:database.properties")

@Import({CustomerConfig.class})
public class AppConfig {
		
	@Bean
	DataSource dataSource_mydb() {
	//logger.debug("in data source");
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/project_schema");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("12345a");
		//driverManagerDataSource.setDriverClassName(environment.getProperty(DRIVER));
		return driverManagerDataSource;
	}
	
   
	
	
}