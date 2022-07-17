package com.prowings.ComponantAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
       
       Mobile m1 = ctx.getBean("mobile", Mobile.class);
       System.out.println(m1);
    }
}
