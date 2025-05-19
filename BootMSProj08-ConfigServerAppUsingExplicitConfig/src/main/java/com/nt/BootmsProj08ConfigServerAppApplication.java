package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BootmsProj08ConfigServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootmsProj08ConfigServerAppApplication.class, args);
	}

}
