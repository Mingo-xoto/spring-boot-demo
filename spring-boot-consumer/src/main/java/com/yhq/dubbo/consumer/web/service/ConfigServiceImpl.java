package com.yhq.dubbo.consumer.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.yhq.dubbo.consumer.config.AppConfig;
import com.yhq.dubbo.consumer.config.MyConfig;

import net.sf.json.JSONObject;

@Service
public class ConfigServiceImpl implements ConfigService {

	private final MyConfig myConfig;

	private final AppConfig appConfig;
	
	@Autowired
	private ApplicationConfig applicationConfig;

	// 只有一个构造函数的时候可以省略@Autowired注解
	public ConfigServiceImpl(MyConfig myConfig, AppConfig appConfig) {
		super();
		this.myConfig = myConfig;
		this.appConfig = appConfig;
	}

	@Override
	public ModelMap getConfig() {
		ModelMap modelMap = new ModelMap();
		modelMap.put("applicationConfig", applicationConfig.getName());
		modelMap.put("myConfig", JSONObject.fromObject(myConfig));
		modelMap.put("appConfig", JSONObject.fromObject(appConfig));
		return modelMap;
	}

}
