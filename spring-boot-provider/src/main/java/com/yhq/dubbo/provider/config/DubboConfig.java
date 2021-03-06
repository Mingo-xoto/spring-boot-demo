package com.yhq.dubbo.provider.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;

/**
 * 由dubbo引入springmvc的上下文配置，
 * 否则因为不确定启动时候是先扫的是springmvc还是dubbo的实例，如果先扫springmvc的controller实例，
 * 会出现在controller取dubbo的reference的时候服务接口为空
 * 
 * @author Administrator
 *
 */
@Configuration
@ComponentScan(basePackages = ("com.yhq.dubbo.provider.service"))
public class DubboConfig {

	/**
	 * dubbo应用信息配置
	 * 
	 * @return
	 */
	@Bean
	public ApplicationConfig applicationConfig() {
		ApplicationConfig applicationConfig = new ApplicationConfig("provider");
		return applicationConfig;
	}

	/**
	 * dubbo注册中心
	 * 
	 * @return
	 */
	@Bean(name = "registryConfig")
	public RegistryConfig registry() {
		RegistryConfig registry = new RegistryConfig("127.0.0.1:2180,127.0.0.1:2181,127.0.0.1:2182");
		registry.setProtocol("zookeeper");
		return registry;
	}

	@Bean
	public AnnotationBean annotationBean() {
		AnnotationBean annotation = new AnnotationBean();
		annotation.setPackage("com.yhq.dubbo.provider.service");
		return annotation;
	}

	/**
	 * 协议配置，用于配置提供服务的协议信息，协议由提供方指定，消费方被动接受
	 * 
	 * @return
	 */
	@Bean(name = "protocolConfig")
	public ProtocolConfig protocol() {
		ProtocolConfig protocol = new ProtocolConfig("dubbo");
		protocol.setPort(20880);
		return protocol;
	}
}
