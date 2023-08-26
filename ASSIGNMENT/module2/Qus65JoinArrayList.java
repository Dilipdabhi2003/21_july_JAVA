package com.module2;

import java.util.ArrayList;

//Write a Java program to join two array lists
public class Qus65JoinArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1= new ArrayList<String>();
        a1.add("Red");
        a1.add("Green");
        a1.add("Black");
        a1.add("White");
        a1.add("Pink");
        System.out.println("List of first array: " + a1);
        ArrayList<String> a2= new ArrayList<String>();
        a2.add("Red");
        a2.add("Green");
        a2.add("Black");
        a2.add("Pink");
        System.out.println("List of second array: " + a2);
       
    // Let join above two list
      ArrayList<String> a3 = new ArrayList<String>();
      a3.addAll(a1);
      a3.addAll(a2);
      System.out.println("New array: " + a3);
	}
}
