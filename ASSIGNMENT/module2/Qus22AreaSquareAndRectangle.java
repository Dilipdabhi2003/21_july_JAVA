package com.module2;
//Create a class to print the area of a square and a rectangle. The class has two methods
//with the same name but different number of parameters. The method for printing
//area of a rectangle has two parameters which are length and breadth respectively
//while the other method for printing area of square has one parameter which is side
//of square
class Area
{
	public void output(int l,int b)
	{
		System.out.println("Area of Rectangle : "+l*b);
	}
	public void output(int a)
	{
		System.out.println("Area of Square : "+a*a);
	}
}
public class Qus22AreaSquareAndRectangle 
{
	public static void main(String[] args) 
	{
		Area Obj=new Area();
		Obj.output(100, 20);
		Obj.output(30);
	}
}
