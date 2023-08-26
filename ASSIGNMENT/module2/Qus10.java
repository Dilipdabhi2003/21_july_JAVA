package com.module2;

import java.util.Scanner;

public class Qus10 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your Number :");
		int n=input.nextInt();
		
		if(n<10)
		{
			int k = n;
			System.out.print(n);
			while(n<100)
			{
					n=n*10;
					k=k+n;
					System.out.print("+"+k);	
			}
		}
		else
		{
			System.out.println(n +" + "+ n+" "+n +" + "+ n+" "+n +" "+n);
		}
		
		
		
		
		
	}
}
