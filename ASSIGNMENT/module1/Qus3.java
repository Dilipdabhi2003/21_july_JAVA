package com.module1;

import java.util.Scanner;

//Qus.3 Write a Java program that takes a year from user and print whether that year is a leap
//year or not. B19. Write a program in Java to display the first 10 natural numbers
//using while loop.


public class Qus3
{
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter Your Year :");
		int year=input.nextInt();
		
		if(year%4==0)
		{
			System.out.println("This is a Leap Year...");
		}
		else
		{
			System.out.println("This is not a Leap Year....");
		}
	}
}
