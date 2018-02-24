package com.yhq.dubbo.consumer.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

/**
 * 静态资源请求路径自动添加文件md5值
 * 
 * @author Administrator
 *
 */
@ControllerAdvice
public class ResourceUrlProviderController {

	@Autowired
	private ResourceUrlProvider resourceUrlProvider;

	@ModelAttribute(value = "urls")
	public ResourceUrlProvider urls(HttpServletRequest request) {
		if (request.getRequestURI().endsWith(".json") || request.getRequestURI().endsWith(".xml") ) {
			return null;
		}
		return resourceUrlProvider;
	}
}
