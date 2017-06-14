package com.yhq.dubbo.consumer.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "my")
public class MyConfig {

	public class Bean {
		private String name;
		private String sex;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

	}

	private boolean fuck;
	private boolean shit;
	private int age;
	private String name;
	private List<String> account;
	private List<String> account2 = new ArrayList<String>();
	private final Bean bean = new Bean();


	public boolean isFuck() {
		return fuck;
	}

	public void setFuck(boolean fuck) {
		this.fuck = fuck;
	}

	public boolean isShit() {
		return shit;
	}

	public void setShit(boolean shit) {
		this.shit = shit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAccount() {
		return account;
	}

	public void setAccount(List<String> account) {
		this.account = account;
	}

	public List<String> getAccount2() {
		return account2;
	}

	public void setAccount2(List<String> account2) {
		this.account2 = account2;
	}

	public Bean getBean() {
		return bean;
	}

}
