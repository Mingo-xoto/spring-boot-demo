package com.yhq.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.yhq.dubbo.consumer.config.DubboConfig;

/**
 * @author Administrator
 *
 */
@SpringBootApplication
@Import({ DubboConfig.class })
public class ConsumerLoader {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConsumerLoader.class, args);
	}
}
