package com.module2;

import java.util.HashMap;
import java.util.Map;

//• Write a Java program to associate the specified value with the specified key in a Hash Map.
public class Qus59AssociateHashMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> h1=new HashMap<Integer, String>();
		h1.put(1, "Red");
		h1.put(2, "Orange");
		h1.put(3, "Green");
		h1.put(4, "Black");
		h1.put(5, "White");
		
		for(Map.Entry x:h1.entrySet())
		{
			System.out.println(x.getKey()+" "+x.getValue());
		}
	}
}
