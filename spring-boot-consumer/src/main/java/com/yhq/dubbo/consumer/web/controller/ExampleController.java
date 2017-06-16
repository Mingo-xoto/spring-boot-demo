package com.yhq.dubbo.consumer.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExampleController {

	@RequestMapping("/example1")
	public ModelAndView example1() {
		Map<String, String> map = new HashMap();
		map.put("1", "a");
		map.put("2", "b");
		return new ModelAndView("example1", map);
	}

}