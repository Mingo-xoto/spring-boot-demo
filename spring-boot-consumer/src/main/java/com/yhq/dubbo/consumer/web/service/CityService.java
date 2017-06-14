package com.yhq.dubbo.consumer.web.service;

import org.springframework.ui.ModelMap;

import com.yhq.dubbo.consumer.web.pojo.City;

public interface CityService {
	ModelMap getMap();

	City getCity(String name, String country);
}
