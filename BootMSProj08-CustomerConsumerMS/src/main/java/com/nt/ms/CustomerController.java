package com.nt.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/api")
public class CustomerController {

	@Value("${dbuser}")
	private String user;

	@Value("${dbpwd}")
	private String password;

	@Value("${dbloc}")
	private String location;

	@GetMapping("/service")
	public String showCustomer() {
		return "[Customer] Data is Collected Through Config Server ::" + user + "...." + password + "...." + location;
	}
}
