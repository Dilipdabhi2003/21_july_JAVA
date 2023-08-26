package com.module2;

import java.util.HashMap;

//Write a Java program to get a collection view of the values contained in this map
public class Qus73GetCollectionView 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h1= new HashMap<Integer,String>();  
	    h1.put(1,"Red");
	    h1.put(2,"Green");
	    h1.put(3,"Black");
	    h1.put(4,"White");
	    h1.put(5,"Blue");
	    
	    System.out.println("Collection view is: "+ h1.values());

	}
}
