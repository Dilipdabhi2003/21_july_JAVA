package com.module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

//Write a Java program to shuffle elements in an array list
public class Qus55ShuffleArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println("Before Shuffle ArrayList : "+al);

        Iterator itr = al.iterator();
        
        while (itr.hasNext()) 
        {
            System.out.print(itr.next() + " ");
        }
  
        System.out.println("");
  
        Random r1 = new Random();
  
        for (int i = al.size() - 1; i >= 1; i--) {
            // swapping current index value
            // with random index value
            Collections.swap(al, i, r1.nextInt(i + 1));
        }
  
        System.out.println("After shuffling Arraylist:");
  
        itr = al.iterator();
  
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
  
	}
}
