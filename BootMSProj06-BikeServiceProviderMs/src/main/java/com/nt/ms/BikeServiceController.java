package com.nt.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bike/api")
public class BikeServiceController {

	@Value("${server.port}")
	private int port;

	@Value("${eureka.instance.instance-id}")
	private String instanceId;

	@GetMapping("/service")
	public ResponseEntity<String> showBikeInfo() {
		return new ResponseEntity<String>(
				"The Bikes Info Ninja ZX-10R, Hayabusa, Ducati Panigale V4, BMW S1000RR, Kawasaki Ninja H2R:: Using Instances ::->"
						+ instanceId + "@port::" + port, HttpStatus.OK);
	}
}
