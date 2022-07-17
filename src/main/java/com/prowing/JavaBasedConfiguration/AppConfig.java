package com.prowing.JavaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.prowing.JavaBasedConfiguration")
public class AppConfig {
	
	@Bean
	public Shopee getShopee() {
		return new Shopee();
	}
}
