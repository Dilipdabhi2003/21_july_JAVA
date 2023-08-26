package com.module2;

import java.util.ArrayList;
import java.util.HashSet;

//Write a Java program to convert a hash set to a List/Array List
public class Qus67HashToArrayList 
{
	public static void main(String[] args) 
	{
		HashSet<String> h1=new HashSet<String>();
		h1.add("Red");
		h1.add("Green");
		h1.add("Black");
		h1.add("White");
		h1.add("Yellow");
		System.out.println("Original Hash Set: " + h1);
		
		ArrayList<String> a1=new ArrayList<String>(h1);
		
		System.out.println("ArrayList Convert :"+a1);
	}
}
