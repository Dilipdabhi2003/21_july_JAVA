package com.module2;

//Print the sum, difference and product of two complex numbers by creating a class
//named 'Complex' with separate methods for each operation whose real and
//imaginary parts are entered by user. 

public class Qus27ComplexClass
{
	  double real, img;
	  Qus27ComplexClass(double r, double i)
	  {
		this.real = r;
      	this.img = i;
	  }

	  public static Qus27ComplexClass sum(Qus27ComplexClass c1, Qus27ComplexClass c2)
	  	{
		  	Qus27ComplexClass temp = new Qus27ComplexClass(0, 0);
		  	temp.real = c1.real + c2.real;
		  	temp.img = c1.img + c2.img;
		  	return temp;
	  	}

public class ComplexClass 
{
	public static void main(String[] args) 
	{
		Qus27ComplexClass c1 = new Qus27ComplexClass(5.5, 4);
		Qus27ComplexClass c2 = new Qus27ComplexClass(1.2, 3.5);
		Qus27ComplexClass temp = sum(c1, c2);
		System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
	}
}
}
