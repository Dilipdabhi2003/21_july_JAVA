package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.Qus9Model;
import com.until.DBUtil;

public class Qus9Dao 
{
	Connection cn=null;
	int x=0;
	public int addData(Qus9Model rmodel)
	{
		cn=new DBUtil().getConnectionData();
		String qry="insert into qus9(fname,lname,address,email,mobile,password)values(?,?,?,?,?,?)";
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1,rmodel.getFname());
			st.setString(2, rmodel.getLname());
			st.setString(3, rmodel.getAddress());
			st.setString(4,rmodel.getEmail());
			st.setString(5, rmodel.getMobile());
			st.setString(6, rmodel.getPassword());
			x=st.executeUpdate();
			cn.close();
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		
		return x;
	}
}
