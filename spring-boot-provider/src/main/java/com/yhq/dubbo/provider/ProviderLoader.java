package com.yhq.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.yhq.dubbo.provider.config.DubboConfig;

@SpringBootApplication
@Import({ DubboConfig.class })
public class ProviderLoader {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ProviderLoader.class, args);
	}
}
