package com.module2;

import java.util.HashSet;

//Write a Java program to get the number of elements in a hash set.
public class Qus58HashSet 
{
	public static void main(String[] args) 
	{
		HashSet<String> h1=new HashSet<String>();
		h1.add("Red");
		h1.add("Yellow");
		h1.add("Green");
		h1.add("Blue");
		h1.add("Orange");
		System.out.println("Original HashList"+h1.size());
		System.out.println("Size Of HashList"+h1);
	}
}
