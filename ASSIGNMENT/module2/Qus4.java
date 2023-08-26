package com.module2;

import java.util.Scanner;

public class Qus4 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		
		int[] a=new int[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter The Number ....");
			a[i]=input.nextInt();
		}
		int n=0;
		for(int i=0;i<5;i++)
		{
			n=n+a[i];
		}
		System.out.println("The Sum Of Number Is..."+n);
		
		int avg=1;
		avg=n/5;
		System.out.println("The Average Of Number Is..."+avg);

	}
}
