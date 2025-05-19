package com.nt.client;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BikeServiceClientComponent {

	@Autowired
	private LoadBalancerClient client;

	public String getBikeInfo() {

		// get bike service instance from eureka server based on load factor
		ServiceInstance instance = client.choose("BootMSProj06-BikeServiceProviderMs");

		// get details from service instance
		URI uri = instance.getUri();

		// prepare provider Ms related uri to consume Method
		String url = uri.toString() + "/bike/api/service";

		// create Rest template class object to consume the provider setvice
		RestTemplate template = new RestTemplate();

		// consume the provider service
		ResponseEntity<String> response = template.getForEntity(url, String.class);

		// get response content from response entity object
		String responseContent = response.getBody();

		return responseContent;
	}

}
