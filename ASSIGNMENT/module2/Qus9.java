package com.module2;

import java.util.Scanner;

public class Qus9 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
		System.out.println("Enter Your Character :");
		char ch=input.next().charAt(0);
		
		int number=ch;
		
		System.out.println("Your Character: "+ ch +" :ASCII value is "+ number);
	}
}
 