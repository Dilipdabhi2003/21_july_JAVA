package com.module2;

//W.A.J.P to create 2 threads and execute that threads by providing sleep time as
//2000ms and check the execution.
class FirstThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(2000);
			}
			catch (Exception e) 
			{
				e.printStackTrace();
				// TODO: handle exception
			}
			System.out.println("My First Thread Is...");
		}
		System.out.println("My Fist Thread is...");
	}
}
public class Qus44TwoThread 
{
	public static void main(String[] args) 
	{
		FirstThread f1=new FirstThread();
		f1.start();
		for(int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(2000);
			}
			catch (Exception e) 
			{
				e.printStackTrace();
				// TODO: handle exception
			}
			System.out.println("My Now Thread Is...");
		}
		System.out.println("My Now Thread is...");
	}
	
}
