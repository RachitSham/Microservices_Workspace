package com.nt.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.BikeServiceClientComponent;

@RestController
@RequestMapping("/insurance/api")
public class InsuranceServiceCotroller {

	@Autowired
	private BikeServiceClientComponent bikecomponent;

	@GetMapping("/service")
	public ResponseEntity<String> showInsuranceInfo() {

		// use client component
		String resultMsg = bikecomponent.getBikeInfo();

		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Company Bike Name(Kawasaki, Suzuki, Ducati, BMW,)::" + resultMsg,
				HttpStatus.OK);
	}
}
