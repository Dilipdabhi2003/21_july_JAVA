package com.module2;

import java.util.ArrayList;

//Write a Java program to replace the second element of an Array List with the
//specified element.
public class Qus70ReplaysElementArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String>  a1 = new ArrayList<String>();

		  a1.add("Red");
		  a1.add("Green");

		  System.out.println("Original array list: " + a1);
		  String str = "White";
		  a1.set(1,str);

		  int num=a1.size();
		  System.out.println("Replace second element with 'White'."); 
		  for(int i=0;i<num;i++)
		  {
			  System.out.println(a1.get(i));
		  }
	}
}
