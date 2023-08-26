package com.module2;

//W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch
//block. try {
//try
//{//code}
//catch (Exception e)
//{//code}
//catch (Exception e)
//{//code}
public class Qus37implementTryCatch 
{
	public static void main(String[] args) 
	{
		try 
		{
			try 
			{
				int a=30/0;
			}
			catch (ArithmeticException e) 
			{
				// TODO: handle exception
				System.out.println(e);
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		try
		{
			int[] b=new int[5];
			System.out.println(b[5]);
		} 
		catch (IndexOutOfBoundsException e) 
		{
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
