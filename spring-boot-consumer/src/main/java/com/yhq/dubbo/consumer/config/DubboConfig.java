package com.yhq.dubbo.consumer.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;

@Configurable
@ComponentScan(basePackages = ("com.yhq.dubbo.consumer.web.controller"))
public class DubboConfig {

	/**
	 * dubbo应用信息配置
	 * 
	 * @return
	 */
	@ConfigurationProperties(prefix = "dubbo.application")
	@Bean
	public ApplicationConfig applicationConfig() {
		return new ApplicationConfig();
	}

	/**
	 * dubbo注册中心
	 * 
	 * @return
	 */
	@ConfigurationProperties(prefix = "dubbo.registry")
	@Bean
	public RegistryConfig registryConfig() {
		return new RegistryConfig();
	}

	@Bean
	public AnnotationBean annotation() {
		AnnotationBean annotation = new AnnotationBean();
		annotation.setPackage("com.yhq.dubbo.consumer.web.controller");
		return annotation;
	}

	/**
	 * 协议配置，用于配置提供服务的协议信息，协议由提供方指定，消费方被动接受
	 * 
	 * @return
	 */
	@ConfigurationProperties(prefix = "dubbo.protocol")
	@Bean
	public ProtocolConfig protocolConfig() {
		return new ProtocolConfig();
	}

}
