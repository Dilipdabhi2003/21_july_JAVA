package com.module2;

//• Take two numbers from the user and perform the division operation and handle
//Arithmetic Exception. O/P- Enter two numbers: 10 0
//Exception in thread main java.lang.ArithmeticException:/ by zero

import java.util.Scanner;
import java.lang.ArithmeticException;
public class Qus35Exception_Arithmatic 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter The First Number :");
			int a=sc.nextInt();
			
			System.out.println("Enter The Second Number :");
			int b=sc.nextInt();
			
			int div=a/b;
			System.out.println("Divide Answer:"+div);
		}
		catch (ArithmeticException e) 
		{
			e.printStackTrace();
			System.out.println("Divide by zero is not allowed");
			// TODO: handle exception
		}
		finally {
			System.out.println("Programm is Complate...");
			
		}
	}
}
