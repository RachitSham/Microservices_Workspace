package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootMsProj06BikeServiceConsumerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj06BikeServiceConsumerMsApplication.class, args);
	}

}
