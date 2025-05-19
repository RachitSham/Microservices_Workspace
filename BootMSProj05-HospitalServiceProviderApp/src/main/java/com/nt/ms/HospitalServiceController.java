package com.nt.ms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital")
public class HospitalServiceController {

	@GetMapping("/service")
	public ResponseEntity<String> hospitalInsuranceInfo() {
		return new ResponseEntity<String>(
				"We Are Providing Individual Health Insurance, Critical Illness Insurance, Family Health Insurance (Family Floater Plans), Maternity Health Insurance:",
				HttpStatus.OK);
	}
}
