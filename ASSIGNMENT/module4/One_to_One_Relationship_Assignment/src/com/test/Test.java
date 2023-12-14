package com.test;

import com.dao.HBDao;
import com.model.Address;
import com.model.Student;

public class Test 
{
	public static void main(String[] args) 
	{
		HBDao dao=new HBDao();
		Address ad=new Address();
		ad.setStreet("Street line");
		ad.setCity("Bhavnagar");
		ad.setState("Gujarat");
		ad.setZipcode("12345");
		dao.addadress(ad);
		
		Student s=new Student();
		s.setStudentname("Aniket");
		s.setAddress("Bhavnagar");
		s.setAd(ad);
		dao.addstudent(s);
	}
}
