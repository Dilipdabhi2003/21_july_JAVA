package com.module2;

//• W.A.J.P to create the validate method that takes integer value as a parameter. If the
//age is less than 18, then throw an Arithmetic Exception otherwise print a message
//welcome to vote.
//O/P- Enter your age: 16
//Exception in thread main java. Lang. Arithmetic Exception: not valid

import java.util.Scanner;

public class Qus39VoteTryCatch 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Your Age:");
			int age=sc.nextInt();
			
			if(age>18)
			{
				System.out.println("Welcome to Vote...");
			}
			else
			{
				throw new ArithmeticException("Invalid Age...");
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
			// TODO: handle exception
		}
	}
}
