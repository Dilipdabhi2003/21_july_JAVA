package com.module2;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program of swap two elements in an array list. 
public class Qus64SwapArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		 
        
        a1.add("Item 1");
        a1.add("Item 2");
        a1.add("Item 3");
        a1.add("Item 4");
        a1.add("Item 5");
 
        
        System.out.println("Before Swap the ArrayList ");
        System.out.println(a1);
 
        
        Collections.swap(a1, 1, 2);
 
        
        System.out.println("After Swap the ArrayList");
        System.out.println(a1);

	}
}
