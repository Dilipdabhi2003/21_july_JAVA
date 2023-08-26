package com.module2;

import java.util.HashSet;
import java.util.Iterator;

//Write a Java program to iterate through all elements in a hash list
public class Qus57HashList 
{
	public static void main(String[] args) 
	{
		HashSet<String> h1=new HashSet<String>();
		h1.add("Red");
		h1.add("Yellow");
		h1.add("Green");
		h1.add("Blue");
		h1.add("Orange");
		
		Iterator<String> i1=h1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
