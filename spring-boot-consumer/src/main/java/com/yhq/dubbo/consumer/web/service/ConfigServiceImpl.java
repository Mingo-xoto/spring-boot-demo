package com.yhq.dubbo.consumer.web.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.yhq.dubbo.consumer.config.AppConfig;
import com.yhq.dubbo.consumer.config.MyConfig;
import com.yhq.dubbo.consumer.config.TopicExchangeConfig;

import net.sf.json.JSONObject;

@Service
public class ConfigServiceImpl implements ConfigService {

	private static final Logger logger = LogManager.getLogger(ConfigServiceImpl.class);

	private final MyConfig myConfig;

	private final AppConfig appConfig;

	@Autowired
	private ApplicationConfig applicationConfig;

	@Autowired
	private TopicExchangeConfig topicExchangeConfig;

	// 只有一个构造函数的时候可以省略@Autowired注解
	public ConfigServiceImpl(MyConfig myConfig, AppConfig appConfig) {
		super();
		this.myConfig = myConfig;
		this.appConfig = appConfig;
	}

	@Override
	public ModelMap getConfig() {
		logger.info("获取config");
		ModelMap modelMap = new ModelMap();
		modelMap.put("topicExchangeConfig", JSONObject.fromObject(topicExchangeConfig));
		modelMap.put("applicationConfig", applicationConfig.getName());
		modelMap.put("myConfig", JSONObject.fromObject(myConfig));
		modelMap.put("appConfig", JSONObject.fromObject(appConfig));
		return modelMap;
	}

}
