package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.Qus9Model;
import com.until.DBUtil;



public class Qus9VerifyDao 
{
	Connection cn=null;
	Qus9Model model=null;
	public Qus9Model getVerify(String email)
	{
		
		Qus9Model f=new Qus9Model();
		try {
			cn= new DBUtil().getConnectionData();
			PreparedStatement st=cn.prepareStatement("select * from qus9 where email=?");
			st.setString(1, email);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				f.setUid(rs.getInt(1));
				f.setFname(rs.getString(2));
				f.setLname(rs.getString(3));
				f.setEmail(rs.getString(5));
				f.setMobile(rs.getString(6));
				f.setAddress(rs.getString(4));
				f.setPassword(rs.getString(7));

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
	public int resetPassword(Qus9Model f)
	{
		int r=0;
		try {
			cn=new DBUtil().getConnectionData();
			PreparedStatement st=cn.prepareStatement("update  qus9 set password=? where id=?");
			st.setString(1, f.getPassword());
			st.setInt(2, f.getUid());
			r=st.executeUpdate();
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}
}
