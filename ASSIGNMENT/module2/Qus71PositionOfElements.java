package com.module2;

import java.util.ArrayList;

//Write a Java program to print all the elements of an Array List using the position of
//the elements.
public class Qus71PositionOfElements 
{
	public static void main(String[] args) 
	{
		  ArrayList <String> a1 = new ArrayList <String> ();
		  a1.add("Red");
		  a1.add("Green");
		  a1.add("Black");
		  a1.add("White");
		  a1.add("Yellow");
		  System.out.println("Original array list: " + a1);
		  System.out.println("Print using index of an element: ");
		  int no_of_elements = a1.size();
		  for (int index = 0; index < no_of_elements; index++)
		   {
			  System.out.println(a1.get(index));
		   }
	}
}
