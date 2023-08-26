package com.module2;

//W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero
//exception and another one is to handle
//ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0; 
public class Qus36MultipleCatch 
{
	public static void main(String[] args) 
	{
		try {
			int[] arr =new int [5];
			arr[5]=30/0;
			System.out.println(arr[10]);
		} catch (IndexOutOfBoundsException e) {
		    System.out.println(e);
		    e.printStackTrace();
		}catch (ArithmeticException e1) {
			e1.printStackTrace();
			System.out.println(e1);
		}
	}
}
