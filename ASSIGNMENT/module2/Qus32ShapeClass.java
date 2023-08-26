package com.module2;

//• We have to calculate the area of a rectangle, a square and a circle. Create an abstract
//class 'Shape' with three abstract methods namely 'RectangleArea' taking two
//parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
//parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
//side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
//all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
//area of rectangle, square and circle respectively. Create an object of class 'Area' and
//call all the three methods.
abstract class Shape
{
	public abstract float AreaRectangle(float length,float breadth);
	abstract float AreaSquare(float length);
	abstract float CircleArea(float rad);
}
class Area1 extends Shape
{

	@Override
	public float AreaRectangle(float length, float breadth)
	{
		float rectangle= length*breadth;
		return rectangle;
	}

	@Override
	float AreaSquare(float length) 
	{
		float square=length*length;
		return square;
	}

	@Override
	float CircleArea(float rad) 
	{
		float circle=(float) (3.14*rad*rad);
		return circle;
	}
	
}
public class Qus32ShapeClass 
{
	public static void main(String[] args) 
	{
		Area1 a1=new Area1();
		System.out.println("Area of Reactangle are :"+a1.AreaRectangle(10,10));
		System.out.println("Area of Square are :"+a1.AreaSquare(10));
		System.out.println("Area of circle are :"+a1.CircleArea(10));

	}
}
