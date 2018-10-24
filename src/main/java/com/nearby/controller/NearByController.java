package com.nearby.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nearby.beans.Cities;
import com.nearby.service.NearByService;

@RestController
public class NearByController {

	@Autowired
	@Qualifier("NearbyServicesImpl")
	NearByService nearbyServicesImpl;
	private static final Logger logger = Logger.getLogger(NearByController.class);

	@RequestMapping("/cities/{country}")
	public Cities getCities(@PathVariable("country") String country) {
		Cities citi = new Cities();
		List<String> cities = nearbyServicesImpl.getCities(country);
		citi.setCities(cities);
		logger.info("Inside message getCities " + cities);
		return citi;
	}
}
