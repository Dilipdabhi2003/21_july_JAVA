package com.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

public class AdminDao
{
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public List<User> getAllUser()
	{
		return hibernateTemplate.loadAll(User.class);
	}
	
	@Transactional
	public void deleteUser(int id)
	{
		User user=hibernateTemplate.get(User.class, id);
		hibernateTemplate.delete(user);
	}
}
