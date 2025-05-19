package com.nt.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Car-Service")
public interface ICarServiceRestConsumer {

	@GetMapping("/car/api/service")
	public String fetchCarInfo();
}
