package com.module2;

// I3. Write a program which will ask the user to enter his/her
//marks (out of 100). Define a method that will display grades according to the marks
//entered as below:
//Marks Grade
//91-100 AA
//81-90 AB
//71-80 BB
//61-70 BC
//51-60 CD
//41-50 DD
//less 41 Fail
import java.util.Scanner;

class Marksheet
{
	
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Marks Subject :");
		int submark=sc.nextInt();
	
	
		if(submark>90 && submark<=100)
		{
			System.out.println("Marks Grade : A");
		}
		else if(submark>80 && submark<=90)
		{
			System.out.println("Marks Grade : B");
		}
		else if(submark>70 && submark<=80)
		{
			System.out.println("Marks Grade : B");
		}
		else if(submark>60 && submark<=70)
		{
			System.out.println("Marks Grade : C");
		}
		else if(submark>50 && submark<=60)
		{
			System.out.println("Marks Grade : D");
		}
		else if(submark>40 && submark<=50)
		{
			System.out.println("Marks Grade : DD");
		}
		else if(submark<=40)
		{
			System.out.println("Marks Grade : Fail");
		}
		
	}
}
public class Qus32BClassMarksheet 
{
	public static void main(String[] args) 
	{
		Marksheet m1=new Marksheet();
		m1.getData();
	}
}
