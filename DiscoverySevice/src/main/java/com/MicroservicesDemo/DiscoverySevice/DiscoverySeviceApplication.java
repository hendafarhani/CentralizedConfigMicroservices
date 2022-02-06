package com.MicroservicesDemo.DiscoverySevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer /** This annotation is needed to enable Eureka Server **/
public class DiscoverySeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverySeviceApplication.class, args);
	}

}
