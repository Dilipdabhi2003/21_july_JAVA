package com.module2;

import java.util.Scanner;
//• W.A.J.P to compare a given string to the specified character sequence. Comparing
//topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false 
public class Qus15Compare 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First String :");
		String s1=sc.nextLine();
		
		System.out.println("Enter Second String :");
		String s2=sc.nextLine();
		
		System.out.println("String Comparison :"+s1.equals(s2));
	}
}
