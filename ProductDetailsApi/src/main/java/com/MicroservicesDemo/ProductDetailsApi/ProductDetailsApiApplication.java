package com.MicroservicesDemo.ProductDetailsApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient /** This annotation is needed to enable Eureka Discovery Client **/
public class ProductDetailsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductDetailsApiApplication.class, args);
	}

}
