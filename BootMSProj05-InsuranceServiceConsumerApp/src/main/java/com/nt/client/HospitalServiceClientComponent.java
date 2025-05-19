package com.nt.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HospitalServiceClientComponent {

	@Autowired
	private DiscoveryClient discovery; // comes to auto configuration

	public String getHospitalInfo() {

		List<ServiceInstance> listInstance = discovery.getInstances("BootMSProj05-HospitalServiceProviderApp");

		ServiceInstance si = listInstance.get(0); // manullay we are piciking up the instance

		String url = si.getUri() + "/hospital/service";

		RestTemplate temlplate = new RestTemplate();

		return temlplate.getForObject(url, String.class);
	}
}
