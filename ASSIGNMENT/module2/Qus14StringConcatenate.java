package com.module2;

import java.util.Scanner;

//• W.A.J.P to concatenate a given string to the end of another string. 
public class Qus14StringConcatenate 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First String :");
		String s1=sc.next();
		
		System.out.println("Enter Second String :");
		String s2=sc.next();
		
		String s3=s1.concat(s2);
		System.out.println("Concatenate a given String is "+s3);
		
	}
}
