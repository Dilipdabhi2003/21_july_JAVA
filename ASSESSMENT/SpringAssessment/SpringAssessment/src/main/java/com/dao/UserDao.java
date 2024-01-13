package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;


import com.model.UserModel;


public class UserDao
{
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public void register(UserModel rmodel)
	{
		 hibernateTemplate.save(rmodel);
	}
	
	@Transactional
	public void update(UserModel u)
	{
		hibernateTemplate.update(u);
	}
	
	public UserModel getById(int id)
	{
		return hibernateTemplate.load(UserModel.class, id);
	}
	
	@Transactional
	public void delete(int id)
	{
		hibernateTemplate.delete(getById(id));;
	}
	
	public List<UserModel> getAll()
	{
		return hibernateTemplate.loadAll(UserModel.class);
	}

	public UserModel login(UserModel lmodel) {
		String qry="from UserModel where email=?0 and password=?1";
		List<UserModel> lists= (List<UserModel>) hibernateTemplate.find(qry, lmodel.getEmail(), lmodel.getPassword());
		if(lists != null && lists.size() == 1)
		{
			return lists.get(0);
		}
		
		return null;
	}
	 public UserModel getByEmail(String email) {
	        String hql = "FROM UserModel WHERE email=:email";
	        List<UserModel> users = (List<UserModel>) hibernateTemplate.find(hql, email);
	        
	    return users.isEmpty() ? null : users.get(0);
	    }
	 
	 public UserModel getByPassword(UserModel user)
	 {
		 String hql="update UserModel set password =?0 where id =?1";
		 List<UserModel> lists= (List<UserModel>) hibernateTemplate.find(hql, user.getPassword(),user.getId());
			
			
			return lists.isEmpty() ? null : lists.get(0);
	 }

	
	 
}
