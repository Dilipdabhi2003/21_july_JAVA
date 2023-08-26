package com.module2;

//• Create an abstract class 'Parent' with a method 'message'. It has two subclasses each
//having a method with the same name 'message' that prints "This is first subclass"
//and "This is second subclass" respectively. Call the methods 'message' by creating
//an object for each subclass.
abstract class Perent
{
	public void massage()
	{
	}
}
class FirstClass extends Perent
{
	public void massage()
	{
		System.out.println("This is First SubClass");
	}
}
class SecondClass extends Parent
{
	public void massage()
	{
		System.out.println("This is Second SubClass");
	}
}
public class Qus28Abstact
{
	public static void main(String[] args) 
	{
		FirstClass f1=new FirstClass();
		SecondClass s1=new SecondClass();
		f1.massage();
		s1.massage();
	}
}
