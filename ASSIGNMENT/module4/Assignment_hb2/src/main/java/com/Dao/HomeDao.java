package com.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.usermodel;
import com.util.DBUtil;

public class HomeDao
{
	Session session=null;
	Transaction tx=null;
	usermodel model=null;
	public usermodel getLogin(int userid)
	{
		session=new DBUtil().getSessionData();
		tx=session.beginTransaction();
		Query q=session.createQuery("from usermodel as u where u.userid=:userid");
		q.setParameter("userid", userid);
		List<usermodel> lists=q.list();
		model=lists.get(0);
		return model;
	}
	public int updateUser(usermodel hmodel)
	{
		int x=0;
		session=new DBUtil().getSessionData();
		tx=session.beginTransaction();
		Query q=session.createQuery("update usermodel as u set u.firstname=?0,u.lastname=?1,u.username=?2,u.password=?3 where u.userid=?4");
		q.setString(0, hmodel.getFirstname());
		q.setString(1, hmodel.getLastname());
		q.setString(2, hmodel.getUsername());
		q.setString(3, hmodel.getPassword());
		q.setInteger(4, hmodel.getUserid());
		
		x=q.executeUpdate();
		tx.commit();
		session.close();
		return x;
	}
	public int daleteUser(int userid)
	{
		int x=0;
		session=new DBUtil().getSessionData();
		tx=session.beginTransaction();
		Query q=session.createQuery("delete from usermodel as u where u.userid=?0");
		q.setInteger(0, userid);
		
		x=q.executeUpdate();
		tx.commit();
		session.close();
		return x;
	}
}
