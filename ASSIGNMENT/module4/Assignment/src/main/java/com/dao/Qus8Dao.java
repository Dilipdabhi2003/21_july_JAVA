package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.Qus8Model;
import com.until.DBUtil;



public class Qus8Dao
{
	Connection cn=null;
	int x=0;
	public int addData(Qus8Model rmodel)
	{
		cn=new DBUtil().getConnectionData();
		String qry="insert into qus8(fname,lname,email,mobile)values(?,?,?,?)";
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1,rmodel.getFname());
			st.setString(2, rmodel.getLname());
			st.setString(3,rmodel.getEmail());
			st.setString(4, rmodel.getMobile());
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
