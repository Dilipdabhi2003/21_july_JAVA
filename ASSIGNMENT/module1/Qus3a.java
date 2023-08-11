package com.module1;

import java.util.Scanner;

public class Qus3a 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Your Number...");
		int n=input.nextInt();
		
		int i=1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}
