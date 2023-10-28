package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.AssessmentUserModel;
import com.util.AssessmentDBUtil;

public class AssessmentVerifyDao 
{
	Connection cn=null;
	AssessmentUserModel model=null;
	public AssessmentUserModel getVerify(String email)
	{
		
		AssessmentUserModel f=new AssessmentUserModel();
		try {
			cn= new AssessmentDBUtil().getConnection();
			PreparedStatement st=cn.prepareStatement("select * from assessment where email=?");
			st.setString(1, email);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				
				f.setId(rs.getInt(1));
				f.setFirstname(rs.getString(2));
				f.setLastname(rs.getString(3));
				f.setEmail(rs.getString(4));
				f.setMobile(rs.getString(5));
				f.setAddress(rs.getString(6));
				f.setGender(rs.getString(7));
				f.setPassword(rs.getString(8));
				f.setCpassword(rs.getString(9));
			}
			else
			{
				f=null;
			}
			
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}
	public int resetPassword(AssessmentUserModel f)
	{
		int r=0;
		try {
			cn=new AssessmentDBUtil().getConnection();
			PreparedStatement st=cn.prepareStatement("update  assessment set password=? where id=?");
			st.setString(1, f.getPassword());
			st.setInt(2, f.getId());
			r=st.executeUpdate();
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}
}
