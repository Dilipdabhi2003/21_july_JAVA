package com.module2;

import java.util.Scanner;

public class Qus7 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Your Number :");
		int a=input.nextInt();
		
		int n=0;
		while(a!=0)
		{
			a=a/10;
			n++;
		}
		System.out.println(n);
	}
}
