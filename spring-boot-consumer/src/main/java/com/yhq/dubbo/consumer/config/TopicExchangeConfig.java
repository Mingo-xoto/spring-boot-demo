package com.yhq.dubbo.consumer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("rabbit-mq")
public class TopicExchangeConfig {

	@Value("${topicExchange.routingKey}")
	private String routingKey;

	public String getRoutingKey() {
		return routingKey;
	}

}
