package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.AssessmentUserModel;
import com.util.AssessmentDBUtil;

public class AssessmentLoginDao 
{
	Connection cn=null;
	AssessmentUserModel model=null;
	public AssessmentUserModel getLogin(AssessmentUserModel lmodel)
	{
		cn= new AssessmentDBUtil().getConnection();
		
		try {
			PreparedStatement st=cn.prepareStatement("select * from assessment where email=? and password=?");
			st.setString(1, lmodel.getEmail());
			st.setString(2, lmodel.getPassword());
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				model=new AssessmentUserModel();
				model.setId(rs.getInt(1));
				model.setFirstname(rs.getString(2));
				model.setLastname(rs.getString(3));
				model.setEmail(rs.getString(4));
				model.setMobile(rs.getString(5));
				model.setAddress(rs.getString(6));
				model.setGender(rs.getString(7));
				model.setPassword(rs.getString(8));
				model.setCpassword(rs.getString(9));
			}
			
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
}
