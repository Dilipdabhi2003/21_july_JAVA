package com.module2;

import java.util.ArrayList;

//Write a Java program to increase the size of an array list.
public class Qus69IncreaseList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> c1= new ArrayList<String>(3);
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        System.out.println("Original array list: " + c1);
        
        c1.ensureCapacity(6);
        c1.add("White");
        c1.add("Pink");
        c1.add("Yellow");
        System.out.println("New array list: " + c1);
	}
}
