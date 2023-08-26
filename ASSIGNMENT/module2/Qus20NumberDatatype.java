package com.module2;

//• Create a class named 'Print Number' to print various numbers of different data types
//by creating different methods with the same name 'printn' having a parameter for
//each data type.

class PrintNumber
{
	public void print(int number)
	{
		System.out.println(number);
	}
	public void print(float number)
	{
		System.out.println(number);
	}
	public void print(double number)
	{
		System.out.println(number);
	}
	public void print(String number)
	{
		System.out.println(number);
	}
	
}
public class Qus20NumberDatatype 
{
	public static void main(String[] args) 
	{
		PrintNumber a=new PrintNumber();
		a.print(10);
		a.print(75.65f);
		a.print(2000);
		a.print("Dilip");
	}
}
