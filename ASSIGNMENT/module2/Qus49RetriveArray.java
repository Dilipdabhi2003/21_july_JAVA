package com.module2;

import java.util.ArrayList;

//Write a Java program to retrieve an element (at a specified index) from a given arraylist. 
public class Qus49RetriveArray 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Orange");
		a1.add("Green");
		a1.add("Blue");
		System.out.println("ArrayList"+a1);
		
		String element=(String) a1.get(0);
		System.out.println("First ArrayList :"+element);
		
		element=(String) a1.get(3);
		System.out.println("Third ArrayList :"+element);
	}
}
