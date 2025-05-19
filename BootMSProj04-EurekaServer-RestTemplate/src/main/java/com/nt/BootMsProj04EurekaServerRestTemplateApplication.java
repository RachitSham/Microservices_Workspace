package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootMsProj04EurekaServerRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj04EurekaServerRestTemplateApplication.class, args);
	}

}
