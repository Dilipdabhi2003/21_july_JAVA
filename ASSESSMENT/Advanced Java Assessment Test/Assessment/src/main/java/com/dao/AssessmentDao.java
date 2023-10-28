package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.model.AssessmentUserModel;
import com.util.AssessmentDBUtil;

public class AssessmentDao
{
	Connection cn=null;
	int x=0;
	public int doRegister(AssessmentUserModel aum)
	{
		cn=new AssessmentDBUtil().getConnection();
		
		try 
		{
			PreparedStatement st=cn.prepareStatement("insert into assessment(firstname,lastname,email,mobile,address,gender,password,cpassword) values(?,?,?,?,?,?,?,?)");
			st.setString(1, aum.getFirstname());
			st.setString(2, aum.getLastname());
			st.setString(3, aum.getEmail());
			st.setString(4, aum.getMobile());
			st.setString(5, aum.getAddress());
			st.setString(6, aum.getGender());
			st.setString(7, aum.getPassword());
			st.setString(8, aum.getCpassword());
			x=st.executeUpdate();
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return x;
		
	}
	
}
