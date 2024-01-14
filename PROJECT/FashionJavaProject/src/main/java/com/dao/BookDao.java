package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.management.Query;

import com.model.BookModel;
import com.util.DBUtil;

public class BookDao 
{
	Connection cn=null;
	int x=0;
	BookModel model=null;
	public int bookProduct(BookModel bmodel)
	{
		cn=new DBUtil().getConnectionData();
		try {
			PreparedStatement ps=cn.prepareStatement("insert into book(customerid,sproductid,price,qty,date,total,bookstatus,paymentstatus) values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, bmodel.getCustomerid());
			ps.setInt(2, bmodel.getSproductid());
			ps.setString(3, bmodel.getPrice());
			ps.setString(4, bmodel.getQty());
			ps.setString(5, bmodel.getDate());
			ps.setString(6, bmodel.getTotal());
			ps.setString(7, bmodel.getBookstatus());
			ps.setString(8, bmodel.getPaymentstatus());
			x=ps.executeUpdate();
			cn.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return x;
	}
	public int update(BookModel bmodel)
	{
		cn=new DBUtil().getConnectionData();
		 try {
		        PreparedStatement ps = cn.prepareStatement("update book set bookstatus=?, paymentstatus=?,qty=?,total=? where sproductid=?");
		        ps.setString(1, bmodel.getBookstatus());
		        ps.setString(2, bmodel.getPaymentstatus());
		        ps.setString(3, bmodel.getQty());
		        ps.setString(4,bmodel.getTotal());
		        ps.setInt(5, bmodel.getSproductid());
		        x=ps.executeUpdate();
		        cn.close();
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		
		
		return x;
	}
	public int delete(int id)
	{
		int x=0;
		cn= new DBUtil().getConnectionData();
		try {
			PreparedStatement ps=cn.prepareStatement("delete from book where sproductid=?");
			ps.setInt(1, id);
			x=ps.executeUpdate();
			cn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	
}
