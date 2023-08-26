package com.module2;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to sort a given array list
public class Qus53SortArrayList 
{
	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Orange");
		a1.add("Green");
		a1.add("Blue");
		System.out.println("ArrayList Before List :"+a1);
		
		Collections.sort(a1);
		System.out.println("ArrayList After List :"+a1);
	}
}
