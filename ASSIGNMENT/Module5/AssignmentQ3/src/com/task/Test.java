package com.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Service userService = (Service)context.getBean("Service");
		userService.createUser("Dilip");
	}
}
