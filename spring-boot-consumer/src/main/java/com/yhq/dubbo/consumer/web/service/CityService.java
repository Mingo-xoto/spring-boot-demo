package com.yhq.dubbo.consumer.web.service;

import com.yhq.dubbo.consumer.web.pojo.City;

public interface CityService {
	City getCity(String name, String country);
}
