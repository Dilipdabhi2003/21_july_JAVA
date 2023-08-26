package com.module2;

import java.util.ArrayList;

//Write a Java program to insert an element into the array list at the first position.
public class Qus48FirstPositionArrayList 
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Orange");
		a1.add("Green");
		a1.add("Blue");
		System.out.println("First ArrayList"+a1);
		
		a1.add(0, "Black");
		a1.add(3, "White");
		System.out.println("Second ArryList"+a1);
		
	}
}
