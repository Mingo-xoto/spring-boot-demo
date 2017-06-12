package com.yhq.dubbo.consumer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yhq.dubbo.consumer.web.service.CityService;
import com.yhq.service.IXFuckService;

@Controller
@EnableAutoConfiguration
public class SampleController {

	@Reference(interfaceClass = IXFuckService.class)
	private IXFuckService fuckService;

	@Autowired
	private CityService cityService;

	@RequestMapping("o")
	@ResponseBody
	String home() {
		return "Hello World!";
	}

	@GetMapping("/")
	@ResponseBody
	public String helloWorld() {
		return this.cityService.getCity("Bath", "UK").getName() + fuckService.fuck();
	}

}