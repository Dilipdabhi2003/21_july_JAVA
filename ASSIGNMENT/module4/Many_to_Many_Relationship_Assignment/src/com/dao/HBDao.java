package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Reader;
import com.model.Subscriptions;
import com.util.HBUtil;

public class HBDao 
{
	Session session=null;
	Transaction tx=null;
	
	public void addReader(Reader r)
	{
		session=new HBUtil().getsession();
		tx=session.beginTransaction();
		session.save(r);
		tx.commit();
		System.out.println("Readers Record Inserted...");
	}
	
	public void addSubsription(Subscriptions sb)
	{
		session= new HBUtil().getsession();
		tx=session.beginTransaction();
		session.save(sb);
		tx.commit();
		System.out.println("Subscriptions Record Inserted...");
	}
}
