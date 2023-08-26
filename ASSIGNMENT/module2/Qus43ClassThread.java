package com.module2;

//W.A.J. P to create one thread by extending Thread class in another Class. 
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Thread is Run...");
	}
}
public class Qus43ClassThread 
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread();
		t1.start();
//		t1.stop();
	}
}
