package com.module2;

import java.util.Scanner;

//Create a class named 'Member' having the following members:
//1. Data members
//2. Name
//3. Age
//4. Phone number
//5. Address
//6. Salary
//It also has a method named 'printSalary' which prints the salary of the members.

class Member
{
	String name,address;
	float age,salary;
	String mobile;
	public void setData()
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter Name :");
		name=sc.nextLine();
		System.out.println("Enter Address:");
		address=sc.nextLine();
		System.out.println("Enter Mobile :");
		mobile=sc.nextLine();
		
		System.out.println("Enter Age;");
		age=sc1.nextFloat();
		System.out.println("Enter Salary :");
		salary=sc1.nextFloat();
	}
	public void displayMemberData()
	{
		System.out.println("--------Member Data---------");
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		System.out.println("Age :"+age);
		System.out.println("Mobile :"+mobile);
	}
	public void Salary()
	{
		System.out.println("Salary :"+salary);
	}
	
}
public class Qus24ClassMember 
{
	public static void main(String[] args) 
	{
		Member m1=new Member();
		m1.setData();
		m1.displayMemberData();
		m1.Salary();
	}
}
