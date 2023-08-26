package com.module2;

//W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set
//Daemon () method of Thread class and check whether the thread is set daemon or
//not by using is Daemon () method.
//TestDaemonThread2 t1=new TestDaemonThread2();
//TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
//t1.setDaemon(true);//will throw exception here t2.start(); 
class DaemonThread extends Thread
{
	public void run()
	{
		 System.out.println("Thread name: " + Thread.currentThread().getName());
	     System.out.println("Check if its DaemonThread: "+ Thread.currentThread().isDaemon());
	}
}
public class Qus46DaemonThread 
{
	public static void main(String[] args) 
	{
		DaemonThread t1=new DaemonThread();
		DaemonThread t2=new DaemonThread();
		
		t1.start();
		t1.setDaemon(true);
		
		t2.start();
	}
}
