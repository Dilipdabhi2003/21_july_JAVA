package com.module2;
//Create a class with a method that prints "This is a parent class" and its subclass with
//another method that prints "This is child class". Now, create an object for each of
//the class and call 1 - method of parent class by object of parent class 2 - method of
//child class by object of child class 3 - method of parent class by object of child class

class Parent
{
	public void Intro()
	{
		System.out.println("This is a Parent class");
	}
}
class Child1 extends Parent
{
	public void Intro()
	{
		System.out.println("This is a child1 class");
	}
}
class Child2 extends Parent
{
	public void Intro()
	{
		System.out.println("This is a child2 class");
	}
}

public class Qus23ClassPerentAndChild 
{
	public static void main(String[] args) 
	{
		Child1 c1=new Child1();
		c1.Intro();
		Child2 c2=new Child2();
		c2.Intro();
	}
}
