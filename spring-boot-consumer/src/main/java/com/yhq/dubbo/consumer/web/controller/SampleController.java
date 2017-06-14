package com.yhq.dubbo.consumer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yhq.dubbo.consumer.web.service.CityService;
import com.yhq.dubbo.consumer.web.service.ConfigService;
import com.yhq.service.IXFuckService;

@Controller
@RequestMapping("/")
public class SampleController {

	@Reference(interfaceClass = IXFuckService.class)
	private IXFuckService fuckService;

	@Autowired
	private CityService cityService;

	@Autowired
	private ConfigService configService;

	@RequestMapping("map")
	@ResponseBody
	ModelMap map() {
		return cityService.getMap();
	}

	@RequestMapping("config")
	@ResponseBody
	ModelMap config() {
		return configService.getConfig();
	}


	@RequestMapping("index")
	@ResponseBody
	public String helloWorld() {
		return cityService.getCity("Bath", "UK").getName() + fuckService.fuck();
	}

}