package com.module2;

import java.util.HashMap;

//Write a Java program to count the number of key-value (size) mappings in a map.
public class Qus60KeyValueMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> h1=new HashMap<Integer, String>();
		h1.put(1, "Red");
		h1.put(2, "Orange");
		h1.put(3, "Green");
		h1.put(4, "Black");
		h1.put(5, "White");
		
		System.out.println("Size of The Hash Map : "+h1.size());
	}
}
