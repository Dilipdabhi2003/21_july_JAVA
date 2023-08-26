package com.module2;

import java.util.ArrayList;

//Write a Java program to search an element in an array list
public class Qus52SearchArrayList 
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
		
		if(a1.contains("Red"))
		{
			System.out.println("Found the Element :");
		}
		else
		{
			System.out.println("There is no such element");
		}
		
	}
}
