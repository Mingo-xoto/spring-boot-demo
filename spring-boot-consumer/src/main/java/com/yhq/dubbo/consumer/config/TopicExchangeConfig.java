package com.yhq.dubbo.consumer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicExchangeConfig {

	@Value("${topicExchange.routingKey}")
	private String routingKey;

	public String getRoutingKey() {
		return routingKey;
	}

}
