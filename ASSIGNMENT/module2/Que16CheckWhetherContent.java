package com.module2;

//• W.A.J.P to check whether a given string ends with the contents of another string.
//"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True 
public class Que16CheckWhetherContent 
{
	public static void main(String[] args) 
	{
		String s1  = "Java Exercises";
		String s2  = "Java Exercise";
		
		System.out.println(s1+" Ends with 'ses'  : "+s1.endsWith("se"));
		System.out.println(s2+" Ends with 'se'  : "+s2.endsWith("se"));
	}
}
