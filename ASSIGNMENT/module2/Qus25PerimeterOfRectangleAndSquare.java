package com.module2;

//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
//two methods to print the area and perimeter of the rectangle respectively. Its
//constructor having parameters for length and breadth is used to initialize the length
//and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
//constructor having a parameter for its side (suppose s) calling the constructor of its
//parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.


class Rectangle
{
	float length,breadth;
	public Rectangle(float length,float breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void areaOfRectangle()
	{
		float area=length*breadth;
		System.out.println("Area Of Rectangle :"+area);
	}
	public void perimeterOfRectangle()
	{
		float perimeter=2*(length*breadth);
		System.out.println("Perimeter Of Rectangle :"+perimeter);
	}
}
public class Qus25PerimeterOfRectangleAndSquare 
{
	public static void main(String[] args)
	{
		Rectangle r1=new Rectangle(10, 20);
		r1.areaOfRectangle();
		r1.perimeterOfRectangle();
	}
}
