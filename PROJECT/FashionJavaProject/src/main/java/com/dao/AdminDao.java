package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.MainProductModel;
import com.model.SubProductModel;
import com.util.DBUtil;

public class AdminDao 
{
	Connection cc=null;
	int x=0;
	SubProductModel model=null;
	public int addMProduct(MainProductModel mpm)
	{
		cc=new DBUtil().getConnectionData();
		String qry="insert into mainproduct(mproductname,mimage)values(?,?)";
		try {
			PreparedStatement st=cc.prepareStatement(qry);
			st.setString(1,mpm.getMproductname());
			st.setString(2, mpm.getMimage());
			
			x=st.executeUpdate();
			cc.close();
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		
		return x;
	}
	
	public int addSProduct(SubProductModel spm)
	{
		x=0;
		cc=new DBUtil().getConnectionData();
		String qry="insert into subproduct(mproductid,sproductname,simage,price,content)values(?,?,?,?,?)";
		try {
			PreparedStatement st=cc.prepareStatement(qry);
			st.setInt(1, spm.getMproductid());
			st.setString(2,spm.getSproductname());
			st.setString(3, spm.getSimage());
			st.setInt(4, spm.getPrice());
			st.setString(5, spm.getContent());
			
			
			x=st.executeUpdate();
			cc.close();
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		
		return x;
	}
	public SubProductModel getAllData(int id)
	{
		cc=new DBUtil().getConnectionData();
		try {
			PreparedStatement ps=cc.prepareStatement("select * from subproduct where sproductid=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				model=new SubProductModel();
				model.setSproductid(rs.getInt(1));
				model.setMproductid(rs.getInt(2));
				model.setSproductname(rs.getString(3));
				model.setSimage(rs.getString(4));
				model.setPrice(rs.getInt(5));
				model.setContent(rs.getString(6));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return model;
	}
	public int editSProduct(SubProductModel spm)
	{
		x=0;
		cc=new DBUtil().getConnectionData();
		String qry="update subproduct set sproductname=?,simage=?,price=?,content=? where sproductid=?";
		try {
			PreparedStatement st=cc.prepareStatement(qry);
			st.setString(1,spm.getSproductname());
			st.setString(2, spm.getSimage());
			st.setInt(3, spm.getPrice());
			st.setString(4, spm.getContent());
			st.setInt(5, spm.getSproductid());
			
			x=st.executeUpdate();
			cc.close();
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		
		return x;
	}
	public int delete(int sid)
	{
		int x=0;
		cc= new DBUtil().getConnectionData();
		try {
			PreparedStatement ps=cc.prepareStatement("delete from subproduct where sproductid=?");
			ps.setInt(1, sid);
			x=ps.executeUpdate();
			cc.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}

}
