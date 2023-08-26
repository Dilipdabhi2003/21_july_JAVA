package com.module2;

import java.util.HashSet;

//Write a Java program to convert a hash set to an array.
public class Qus66HashToArray
{
	public static void main(String[] args) 
	{
		HashSet<String> h1 = new HashSet<String>();
		   
		h1.add("Red");
		h1.add("Green");
		h1.add("Black");
		h1.add("White");
		h1.add("Yellow");
		System.out.println("Original Hash Set: " + h1);
		     
		String[] new_array = new String[h1.size()];
		h1.toArray(new_array);
		 
		     
		System.out.println("Array elements: ");
		
		for(String element : new_array)
		{
		  System.out.println(element);
		}  
	}
}
