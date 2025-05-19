package com.nt.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.HospitalServiceClientComponent;

@RestController
@RequestMapping("/insurance")
public class InsuranceServiceController {

	@Autowired
	private HospitalServiceClientComponent hospitalClient;

	@GetMapping("/service")
	public ResponseEntity<String> showInsuranceCompany() {

		// Use Client component support to invoke provider MS Service
		String entity = hospitalClient.getHospitalInfo();

		// return ResponseEntity<String> Object From Consumer Ms
		String insuranAmount = "Insurance Amount :: " + new Random().nextInt(1000000);

		// Contains provider Ms + Consumer Ms
		return new ResponseEntity<String>(insuranAmount + "...." + entity, HttpStatus.OK);
	}
}
