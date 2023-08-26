package com.module2;

//W.A.J. P to demonstrate try catch block, take two numbers from the user by
//Command line argument and perform the division operation and handle Arithmetic
//O/PException in thread main java. Lang. Arithmetic Exception:/ by zero

import java.util.Scanner;

public class Qus38DemonstrateTryCatch 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter The First Number :");
			int num1=sc.nextInt();
			
			System.out.println("Enter The Second Number :");
			int num2=sc.nextInt();
			
			int num3=num1/num2;
			System.out.println("Result :"+num3);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Error :"+e.getMessage());
			System.out.println("Error :"+e);
			// TODO: handle exception
		}
	}
}
