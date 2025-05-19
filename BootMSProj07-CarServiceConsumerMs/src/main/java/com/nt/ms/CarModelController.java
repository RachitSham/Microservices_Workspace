package com.nt.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.feign.ICarServiceRestConsumer;

@RestController
@RequestMapping("/car/api")
public class CarModelController {

	@Autowired
	private ICarServiceRestConsumer consumer;

	@GetMapping("/model")
	public String displayCarModel() {
		System.out.println("CarModelController ::nClientb Component Class Name ::" + consumer.getClass());

		return "Sports Car Models Are..." + consumer.fetchCarInfo();
	}
}
