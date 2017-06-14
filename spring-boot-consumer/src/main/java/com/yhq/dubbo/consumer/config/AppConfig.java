package com.yhq.dubbo.consumer.config;

import java.net.InetAddress;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 *
 */

/**
 * @author Administrator
 *
 */
@Configuration
@ConfigurationProperties(prefix = "app")
public class AppConfig {

	private InetAddress remoteAddress;
	private String name;
	private final AppChildConfig childConfig = new AppChildConfig();

	public InetAddress getRemoteAddress() {
		return remoteAddress;
	}

	public void setRemoteAddress(InetAddress remoteAddress) {
		this.remoteAddress = remoteAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AppChildConfig getChildConfig() {
		return childConfig;
	}

	public static class AppChildConfig {

		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

}
