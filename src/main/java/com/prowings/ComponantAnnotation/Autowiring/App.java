package com.prowings.ComponantAnnotation.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Customer cust = ctx.getBean("customer", Customer.class);
		System.out.println(cust);
		
	}
}
