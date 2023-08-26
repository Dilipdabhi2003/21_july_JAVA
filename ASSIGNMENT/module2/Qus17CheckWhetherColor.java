package com.module2;

//W.A.J.P to check whether a given string starts with the contents of another string.
//Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
//with Red? False I3. 
public class Qus17CheckWhetherColor 
{
	public static void main(String[] args) 
	{
		String s1="Red is Favorire color";
		String s2="Orange Is also my favorite color";
		String s3="Red";
		
		System.out.println(s1+"Start With Red : "+s1.startsWith(s3));
		System.out.println(s2+"Start With Red : "+s2.startsWith(s3));
	}
}
