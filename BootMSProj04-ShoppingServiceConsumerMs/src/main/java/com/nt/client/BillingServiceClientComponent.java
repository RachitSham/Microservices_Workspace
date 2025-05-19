package com.nt.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceClientComponent {

	@Autowired
	private DiscoveryClient client; // comes through Auto Configuration

	public String getBillingInfo() {
		// find and get service Instances of producer by Using Service Id
		List<ServiceInstance> listSI = client.getInstances("Billing-Service");

		// user first service Instance from the List of the Instances
		ServiceInstance si = listSI.get(0); // manually we are picking up the instances

		// get producer MS URI and It As URL
		String url = si.getUri() + "/billing/info";

		// Create Rest Template Object
		RestTemplate template = new RestTemplate();

		// invoke producer MS service Method Or Operation by Generating Http Call
		return template.getForObject(url, String.class);

	}
}
