package com.module2;

import java.util.ArrayList;
import java.util.List;

//• Write a Java program to extract a portion of an array list
public class Qus62ExtractArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Red");
		a1.add("Yellow");
		a1.add("Orange");
		a1.add("Green");
		a1.add("Blue");
		System.out.println("ArrayList Before Reverse :"+a1);
		
		List<String> s1=a1.subList(0, 3);
		
		System.out.println("List First to Three Elements :"+s1);
	}
}
