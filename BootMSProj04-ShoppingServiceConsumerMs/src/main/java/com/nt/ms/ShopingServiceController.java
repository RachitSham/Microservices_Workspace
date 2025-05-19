package com.nt.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.BillingServiceClientComponent;

@RestController
@RequestMapping("/shopping")
public class ShopingServiceController {

	@Autowired
	private BillingServiceClientComponent client;

	@GetMapping("/details")
	public ResponseEntity<String> showBillingData() {
		// use Client component support to invoke provider MS Service
		String entity = client.getBillingInfo();

		// return ResponseEntity<String> Object From Consumer Ms
		String billInfo = "Bill Amount :: " + new Random().nextInt(10000); // Consumer Ms Result
		
		// Contains provider Ms + Consumer Ms
		return new ResponseEntity<String>(billInfo + "..." + entity, HttpStatus.OK);
	}
}
