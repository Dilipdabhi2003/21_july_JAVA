package com.module2;

import java.util.HashSet;
import java.util.Iterator;

//Write a Java program to append the specified element to the end of a hash set. 
public class Qus56HashSet 
{
	public static void main(String[] args) 
	{
		HashSet h1=new HashSet();
		System.out.println("Default size is..."+h1.size());
		System.out.println("Default Value is..."+h1);
		
		h1.add(123);
		h1.add("Dilip");
		h1.add(75.65f);
		h1.add("D");
		h1.add(new Integer(100));
		h1.add("Dilip");
		System.out.println("Default size is..."+h1.size());
		System.out.println("Default Value is..."+h1);
		
		h1.remove("Dilip");
		System.out.println("Default size is..."+h1.size());
		System.out.println("Default Value is..."+h1);
		
		Iterator i1=h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
