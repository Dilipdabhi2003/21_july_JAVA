package com.module1;

import java.util.Scanner;
//Qus.2...Write a Java program that takes the user to provide a single character from the
//alphabet. Print Vowel or Consonant, depending on the user input. If the user input
//is not a letter (between a and z or A and Z), or is a string of length > 1, print an error
//message.


public class Qus2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input an alphabet: ");
       String a= sc.next();
       char ch=a.charAt(0);
        
        
        if(a.length()>1)
        {
        	System.out.println("Error...");
        }
        else if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }
		
	}
}
