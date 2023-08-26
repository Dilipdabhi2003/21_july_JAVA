package com.module2;

//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
//5 units by creating a class named 'Triangle' without any parameter in its constructor.
class Triangle
{
	int side1=3,side2=4,side3=5;
	public void Area()
	{
		float s=side1+side2+side3;
		double a=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("Area Of Triangle :"+a);
	}
	public void perimeter()
	{
		System.out.println("Perimeter Of Triangle:"+(side1+side2+side3));
	}
}

public class Qus26AreaAndPerimeterOfTriangle 
{
	public static void main(String[] args) 
	{
		Triangle t1 = new Triangle();
		t1.Area();
		t1.perimeter();
	}
}
