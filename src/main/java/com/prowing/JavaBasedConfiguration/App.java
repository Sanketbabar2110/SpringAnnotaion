package com.prowing.JavaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Shopee s1 = ctx.getBean(Shopee.class);
		System.out.println(s1);
		
		Mobile m1 = ctx.getBean("mobile", Mobile.class);
		System.out.println(m1);
	}
}
