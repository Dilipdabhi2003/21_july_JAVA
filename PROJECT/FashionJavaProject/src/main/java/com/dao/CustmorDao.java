package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.CustomerModel;
import com.util.DBUtil;

public class CustmorDao 
{
	Connection cn=null;
	int x=0;
	public int custmorRegistration(CustomerModel rmodel)
	{
		cn=new DBUtil().getConnectionData();
		String qry="insert into customer(firstname,lastname,address,city,pincode,mobile,email,password)values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, rmodel.getFirstname());
			st.setString(2, rmodel.getLastname());
			st.setString(3, rmodel.getAddress());
			st.setString(4, rmodel.getCity());
			st.setInt(5, rmodel.getPincode());
			st.setString(6, rmodel.getMobile());
			st.setString(7, rmodel.getEmail());
			st.setString(8, rmodel.getPassword());
			x=st.executeUpdate();
			cn.close();
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		
		return x;
	}
	
	CustomerModel  model=null;
	public CustomerModel getCustomerLogin(CustomerModel lmodel)
	{
		cn=new DBUtil().getConnectionData();
		String qry="select * from customer where email=? and password=?";
		try
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, lmodel.getEmail());
			st.setString(2, lmodel.getPassword());
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				model=new CustomerModel();
				model.setCustomerid(rs.getInt(1));
				model.setFirstname(rs.getString(2));
				model.setLastname(rs.getString(3));
				model.setAddress(rs.getString(4));
				model.setCity(rs.getString(5));
				model.setPincode(rs.getInt(6));
				model.setMobile(rs.getString(7));
				model.setEmail(rs.getString(8));
				model.setPassword(rs.getString(9));
				
				
			}
			cn.close();
		} 
		catch (Exception e) {
			model=null;
			e.printStackTrace();
		}
		
		
		
		return model;
	}
	
	
}
