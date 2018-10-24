package com.nearby.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.nearby.controller.NearByController;
@Component("NearbyServicesImpl")
public class NearbyServicesImpl<T> implements NearByService {

	private static final Logger logger = Logger.getLogger(NearbyServicesImpl.class);

	public static List<String> cityList;
	static {
		cityList = new ArrayList<>();
		cityList.add("Delhi");
		cityList.add("Mumbai");
		cityList.add("Chennai");
		cityList.add("Bengaluru");
		cityList.add("Kolkata");
		Collections.sort(cityList);
	}

	@Override
	public List<String> getCities(String name) {
		logger.info("Inside " + new Object() {
		}.getClass().getEnclosingMethod().getName()+" "+cityList);
				
		return (List<String>) cityList;
	}

}
