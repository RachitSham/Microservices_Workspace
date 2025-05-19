package com.nt.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee/api")
public class EmployeeController {

	@Value("${dbuser}")
	private String user;

	@Value("${dbpwd}")
	private String password;

	@Value("${dbloc}")
	private String location;

	@GetMapping("/show")
	public String showEmployee() {
		return "Data Is Collected Through Config Server:: " + user + "...." + password + "...." + location;
	}
}
