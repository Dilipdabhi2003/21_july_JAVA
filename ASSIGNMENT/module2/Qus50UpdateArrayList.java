package com.module2;

import java.util.ArrayList;

//Write a Java program to update specific array element by given element.
public class Qus50UpdateArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList();
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Orange");
		a1.add("Green");
		a1.add("Blue");
		System.out.println("ArrayList"+a1);
		
		a1.set(1, "White");
		System.out.println("Update AraayList :"+a1);
	}
}
