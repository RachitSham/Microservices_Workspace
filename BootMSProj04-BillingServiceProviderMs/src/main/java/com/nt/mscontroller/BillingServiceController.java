package com.nt.mscontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingServiceController {

	@GetMapping("/info")
	public ResponseEntity<String> getBillingInfo() {
		return new ResponseEntity<String>(
				"We Accepted Debit Card, Credit Card, UPI Payment, NetBanking Payment, Cash On Delivery ",
				HttpStatus.OK);
	}
}
