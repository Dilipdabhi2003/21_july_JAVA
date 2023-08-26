package com.module2;

//• Create a class named 'Shape' with a method to print "This is this is shape". Then
//create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both
//having a method to print "This is rectangular shape" and "This is circular shape"
//respectively. Create a subclass 'Square' of 'Rectangle' having a method to print
//"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the
//object of 'Square' class. 
class Shape1
{
	public void shape()
	{
		System.out.println("This is this is Shape");
	}
}
class Rectangle1 extends Shape1
{
	public void rect()
	{
		System.out.println("This is rectangular shape");
	}
}
abstract class Circle extends Shape
{
	public void circle()
	{
		System.out.println("This is circular shape");
	}
}

class Square extends Rectangle1
{
	public void square()
	{
		System.out.println("Square is a rectangle");
	}
}
public class Qus33ClassShape2 
{
	public static void main(String[] args) 
	{
		Square s1=new Square();
		s1.shape();
		s1.rect();
	}
}
