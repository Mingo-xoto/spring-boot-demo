package com.yhq.dubbo.consumer.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import com.yhq.dubbo.consumer.config.AppConfig;
import com.yhq.dubbo.consumer.config.MyConfig;
import com.yhq.dubbo.consumer.web.pojo.City;

import net.sf.json.JSONObject;

@Component("cityService")
public class CityServiceImpl implements CityService {

	@Autowired
	private MyConfig myConfig;

	@Autowired
	private AppConfig appConfig;

	@Override
	public City getCity(String name, String country) {
		City city = new City("广州", "中国");
		return city;
	}

	public ModelMap getMap() {
		ModelMap modelMap = new ModelMap();
		modelMap.put("myConfig", JSONObject.fromObject(myConfig));
		modelMap.put("appConfig", JSONObject.fromObject(appConfig));
		return modelMap;
	}
}
