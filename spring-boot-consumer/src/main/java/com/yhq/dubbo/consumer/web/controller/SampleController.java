package com.yhq.dubbo.consumer.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yhq.dubbo.consumer.web.pojo.City;
import com.yhq.dubbo.consumer.web.service.CityService;
import com.yhq.dubbo.consumer.web.service.ConfigService;

@Controller
@RequestMapping("/")
public class SampleController {

	// @Reference(interfaceClass = IXFuckService.class)
	// private IXFuckService fuckService;

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

	@RequestMapping(value = "index")
	public ModelAndView index(ModelMap model) {
		ModelAndView modelAndView = new ModelAndView("index");
		model.put("time", new Date());
		model.put("message", "啥？");
		model.put("message1", "所属？");
		model.put("message3", "自动重启测试");
		modelAndView.addAllObjects(model);
		return modelAndView;
	}

	@RequestMapping("city")
	@ResponseBody
	public City city() {
		return new City("广州", "中国");
	}

	@RequestMapping(value = "hello", method = RequestMethod.POST)
	public String helloWorld() {
		return "index";
	}
}