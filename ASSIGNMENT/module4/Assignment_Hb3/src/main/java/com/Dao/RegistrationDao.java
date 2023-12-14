package com.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.usermodel;
import com.util.HBUntil;

public class RegistrationDao 
{
	Session session=null;
	Transaction tx=null;
	String msg="error";
	
	public String doRegister(usermodel rmodel)
	{
		try 
		{
			session=new HBUntil().getSessionData();
			tx=session.beginTransaction();
			session.save(rmodel);
			tx.commit();
			session.close();
			msg="Record Inserted";
			
		} catch (Exception e) {
			msg="erros";
			e.printStackTrace();
		}
		return msg;
	}
}
