package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.CustomerModel;
import com.util.DBUtil;



public class VerifyDao 
{
	Connection cn=null;
	CustomerModel model=null;
	public CustomerModel getVerify(String email)
	{
		
		CustomerModel f=new CustomerModel();
		try {
			cn= new DBUtil().getConnectionData();
			PreparedStatement st=cn.prepareStatement("select * from customer where email=?");
			st.setString(1, email);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				
				f.setCustomerid(rs.getInt(1));
				f.setFirstname(rs.getString(2));
				f.setLastname(rs.getString(3));
				f.setAddress(rs.getString(4));
				f.setCity(rs.getString(5));
				f.setPincode(rs.getInt(6));
				f.setMobile(rs.getString(7));
				f.setEmail(rs.getString(8));
				f.setPassword(rs.getString(9));
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
	public int resetPassword(CustomerModel f)
	{
		int r=0;
		try {
			cn=new DBUtil().getConnectionData();
			PreparedStatement st=cn.prepareStatement("update  customer set password=? where customerid=?");
			st.setString(1, f.getPassword());
			st.setInt(2, f.getCustomerid());
			r=st.executeUpdate();
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}
}
