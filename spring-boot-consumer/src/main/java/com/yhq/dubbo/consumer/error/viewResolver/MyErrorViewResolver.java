package com.yhq.dubbo.consumer.error.viewResolver;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.ErrorViewResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

/**
 * 自定义错误页面
 * 
 * @author Administrator
 *
 */
@Configuration
public class MyErrorViewResolver implements ErrorViewResolver {

	@Override
	public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
		ModelAndView modelAndView = new ModelAndView("error/error");
		ModelMap map = new ModelMap();
		map.put("status", status.value());
		map.put("message", "请求姿势不对，请摆正姿势再来");
		modelAndView.addAllObjects(map);
		return modelAndView;
	}

}
