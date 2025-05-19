package com.nt.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wish-api")
public class GenerateMessage {

	@Value("${spring.application.instance-id}")
	private String instance_id;

	@GetMapping("/message")
	public ResponseEntity<String> messageGenerator() {

		// get local Date and Time
		LocalDateTime ldt = LocalDateTime.now();

		// get the current Hour
		int hour = ldt.getHour();

		String message = null;

		if (hour < 12)
			message = "Good Morning..Eureka Server !!";

		else if (hour < 16)
			message = "Good Afternoon..Eureka Server !! ";

		else if (hour < 20)
			message = "Good Evening..Eureka Server!!";

		else
			message = "Good Night..Eureka Server !!";

		// improve the output
		message = message + "----" + instance_id;

		// return response entity object
		return new ResponseEntity<String>(message, HttpStatus.OK);

	}
}
