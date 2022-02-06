package com.MicroservicesDemo.CustomerDetailsApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient /** This annotation is needed to enable Eureka Discovery Client **/
public class CustomerDetailsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerDetailsApiApplication.class, args);
	}

}
