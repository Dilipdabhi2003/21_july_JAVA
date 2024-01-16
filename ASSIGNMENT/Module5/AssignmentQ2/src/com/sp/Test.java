package com.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Person p1=(Person)context.getBean("p1");
		p1.display();
	}
}
