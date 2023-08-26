package com.module2;

//W.A.J.P to start the same Thread twice by calling start () method twice. Test
//ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start (); 
class TwiceTread extends Thread
{
	public void run()
	{
		System.out.println("Thread Started...");
	}
}
public class Qus45TwiceThread 
{
	public static void main(String[] args) 
	{
		TwiceTread t1=new TwiceTread();
		t1.start();
		t1.start();
	}
}
