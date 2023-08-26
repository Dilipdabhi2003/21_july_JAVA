package com.module2;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to copy one array list into another. 
public class Qus54CopyArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("1");
		a1.add("2");
		a1.add("3");
		a1.add("4");
		a1.add("5");
		System.out.println("First ArrayList List :"+a1);
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("A");
		a2.add("B");
		a2.add("C");
		a2.add("D");
		a2.add("E");
		System.out.println("First ArrayList List :"+a2);
		
		Collections.copy(a1, a2);
		 System.out.println("Copy List to List2,\nAfter copy:");
		 System.out.println("First List: " + a1);
		 System.out.println("Second List: " + a2);
		 
	}
}
