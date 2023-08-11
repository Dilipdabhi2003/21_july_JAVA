package com.module1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthToggleButtonUI;

//Qus.1 • Write a Java program to Take three numbers from the user and print the greatest
//        number
public class Qus1 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Value Of Number.1...");
		int No1=input.nextInt();
		
		System.out.println("Enter the Value Of Number.2...");
		int No2=input.nextInt();
		
		System.out.println("Enter the value Of Number.3...");
		int No3=input.nextInt();
		
		if(No1>No2 && No1>No3)
		{
			System.out.println("The Value Of No.1 is Max Number..."+No1);
		}
		else if(No2>No1 && No2>No3)
		{
			System.out.println("The Value Of No.2 is Max Number..."+No2);
		}
		else if(No3>No1 && No3>No2)
		{
			System.out.println("The Vale Of No.3 is Max Number..."+No3);
		}
		
	}
}
