package com.nt.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car/api")
public class CarServiceController {

	@Value("${server.port}")
	private int port;

	@Value("${eureka.instance.instance-id}")
	private String instanceId;

	@GetMapping("/service")
	public String getCarInfo() {
		
		return "We are Having different Car Model :- Porsche 911, Astoim Martin, Lamborghini, Jaguar, Bentley, Ferrari :: --> port:: "
				+ port + "instanceId::" + instanceId;
	}
}
