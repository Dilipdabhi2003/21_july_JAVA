package com.test;

import com.dao.HBDao;
import com.model.Cart;
import com.model.Item;

public class Test 
{
	public static void main(String[] args) 
	{
		HBDao dao=new HBDao();
		Cart c=new Cart();
		c.setName("Burger");
		c.setTotal(3);
		
		Item i=new Item();
		i.setItemid("1");
		i.setItemtotal(2);
		i.setQuantity(1);
	}
}
