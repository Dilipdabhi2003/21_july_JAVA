package com.module2;
//Create a class to print an integer and a character with two methods having the same
//name but different sequence of the integer and the character parameters. For
//example, if the parameters of the first method are of the form (int n, char c), then
//that of the second method will be of the form (char c, int n).

class PrintIntegerChar
{
	public void print(int number,char ch)
	{
		System.out.println("Integer :"+number+" "+"Character : "+ch);
	}
	public void print(char ch,int number)
	{
		System.out.println("Integer :"+number+" "+"Character : "+ch);
	}
}
public class Qus21IntegerChar 
{
	public static void main(String[] args) 
	{
		PrintIntegerChar Obj=new PrintIntegerChar();
		Obj.print(13, 'D');
		Obj.print('D', 17);
	}
}
