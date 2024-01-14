package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;


import com.model.ReviewModel;
import com.util.DBUtil;

public class ReviewDao
{
	Connection cc=null;
	int x=0;
	
	public int addReview(ReviewModel rmodel)
	{
		cc=new DBUtil().getConnectionData();
		String qry="insert into review(name,email,rating,comments)values(?,?,?,?)";
		
		try {
			PreparedStatement st=cc.prepareStatement(qry);
			st.setString(1, rmodel.getName());
			st.setString(2, rmodel.getEmail());
			st.setString(3, rmodel.getRating());
			st.setString(4, rmodel.getComments());
			x=st.executeUpdate();
			cc.close();
		} 
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
		
		return x;
	}
	
}
