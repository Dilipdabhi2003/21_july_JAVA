package com.hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test 
{
	public static void main(String[] args) 
	{
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory fact=cfg.buildSessionFactory();
			Session session=fact.openSession();
			Transaction tx=session.beginTransaction();
			
			Person p1=new Person();
			p1.setId(1);
			p1.setFname("Dilip");
			p1.setLname("Dabhi");
			p1.setEmail("Dilipdabhi@gmail.com");
			p1.setMobile("9090909090");
			p1.setPassword("12345");
			p1.setGender("Male");
			
			session.save(p1);
			tx.commit();
			session.close();
			System.out.println("Person Data Inserted");
			
	}
}
