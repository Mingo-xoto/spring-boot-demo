package com.yhq.dubbo.consumer.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.yhq.dubbo.consumer.config.DubboConfig;

@SpringBootApplication
@Import({ DubboConfig.class })
public class ConsumerLoader {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConsumerLoader.class, args);
	}
}
