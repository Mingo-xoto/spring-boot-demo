package com.yhq.dubbo.consumer.web.controller;

import java.util.List;

import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.ErrorViewResolver;

public class MyErrorController extends BasicErrorController {

	public MyErrorController(ErrorAttributes errorAttributes, ErrorProperties errorProperties,
			List<ErrorViewResolver> errorViewResolvers) {
		super(errorAttributes, errorProperties, errorViewResolvers);
		// TODO Auto-generated constructor stub
	}

}
