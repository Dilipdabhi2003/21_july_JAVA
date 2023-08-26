package com.module2;
//• Write a Java program to count the letters, spaces, numbers and other characters of
//an input string. 
import java.util.Scanner;

public class Qus8
{
	public static void count(String a)
	{
		char[] ch=a.toCharArray();
		int letter=0;
		int space=0;
		int number=0;
		int other=0;
		for(int i=0;i<a.length();i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			else if(Character.isDigit(ch[i]))
			{
				number++;
			}
			else
			{
				other++;
			}
		}
		
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + number);
		System.out.println("other: " + other);
		
		
	}
	public static void main(String[] args) 
	{
		String test="Samedh Complex, 905, CG Road, Ahmedabad, Gujarat 380009";  
		System.out.println("Your String : "+test);
		count(test);
	}
}
