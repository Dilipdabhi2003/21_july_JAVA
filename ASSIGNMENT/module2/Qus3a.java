package com.module2;

import java.util.Scanner;

public class Qus3a 
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
