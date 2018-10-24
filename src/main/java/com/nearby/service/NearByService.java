package com.nearby.service;

import java.util.List;

public interface NearByService {
	public <T> List<String> getCities(String name);
}