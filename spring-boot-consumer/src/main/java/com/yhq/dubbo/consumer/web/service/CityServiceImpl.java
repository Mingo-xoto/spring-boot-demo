package com.yhq.dubbo.consumer.web.service;

import org.springframework.stereotype.Component;

import com.yhq.dubbo.consumer.web.pojo.City;

@Component("cityService")
public class CityServiceImpl implements CityService {

	@Override
	public City getCity(String name, String country) {
		City city = new City("广州", "中国");
		return city;
	}

}
