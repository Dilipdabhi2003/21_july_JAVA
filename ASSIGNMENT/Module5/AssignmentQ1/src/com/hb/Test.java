package com.hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test 
{
	public static void main(String[] args) 
	{
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory fact=cfg.buildSessionFactory();
		Session session=fact.openSession();
		Transaction tx=session.beginTransaction();
		
		Person p1=new Person();
		p1.setId(1);
		p1.setName("Dilip");
		p1.setCity("Bhavnagar");
		
		session.save(p1);
		tx.commit();
		session.close();
		
		System.out.println("Person Record Inserted");
	}
}
