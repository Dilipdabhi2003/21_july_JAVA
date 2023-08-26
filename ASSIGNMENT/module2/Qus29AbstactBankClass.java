package com.module2;

//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
//$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
//are subclasses of class 'Bank', each having a method named 'getBalance'. Call this
//method by creating an object of each of the three classes. 
abstract class Bank
{
	abstract void getBalance();
}
class BankA extends Bank
{
	@Override
	void getBalance()
	{
		System.out.println("$100 deposited in BankA");
	}
}
class BankB extends Bank
{
	@Override
	void getBalance()
	{
		System.out.println("$150 deposited in BankB");
	}
}
class BankC extends Bank
{
	@Override
	void getBalance()
	{
		System.out.println("$200 deposited in BankC");
	}
}
public class Qus29AbstactBankClass 
{
	public static void main(String[] args) 
	{
		BankA b1=new BankA();
		BankB b2=new BankB();
		BankC b3=new BankC();
		b1.getBalance();
		b2.getBalance();
		b3.getBalance();
	}
}
