package com.module2;

import java.util.ArrayList;

//• Write a Java program to iterate through all elements in an array list.
public class Qus47AllElementsArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(123);
		a1.add("Dilip");
		a1.add(75.65f);
		a1.add("D");
		a1.add(new Integer(100));
		a1.add("Dilip");
		System.out.println("Default size is..."+a1.size());
		System.out.println("Default Value is..."+a1);
	}
}
