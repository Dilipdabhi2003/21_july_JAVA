package com.module2;

import java.util.ArrayList;

//Write a Java program to remove the third element from an array list
public class Qus51RemoveArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Orange");
		a1.add("Green");
		a1.add("Blue");
		System.out.println("ArrayList"+a1);
		
		a1.remove(2);
		System.out.println("After Third Element From ArrayList :"+a1);
	}
}
