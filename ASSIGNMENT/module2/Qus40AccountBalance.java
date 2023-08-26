package com.module2;

//W.A.J.P to create a custom exception if Customer withdraw amount which is greater
//than account balance then program will show custom exception otherwise amount
//will deduct from account balance. Account balance is: 2000 Enter withdraw amount:
//2500
//Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.

import java.util.Scanner;

class NoBalanceInAccountException extends Exception
{
	double amount;
	public NoBalanceInAccountException(double amount)
	{
		this.amount=amount;
	}
}
class ATM
{
	double balance;
	public void deposit(double amount)
	{
		balance= balance + amount;
		System.out.println(amount+"RS Deposited...");
	}
	public void withdrawl(double amount) throws NoBalanceInAccountException
	{
		if(amount<=balance)
		{
			balance= balance - amount;
			System.out.println(amount+"RS Withdrawal Successfully...");
		}
		else
		{
			double needs=amount-balance;
			throw new NoBalanceInAccountException(needs);
		}
	}
}
public class Qus40AccountBalance 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ATM a1=new ATM();
		System.out.println("Enter Amount for Deposit...");
		double amount=sc.nextDouble();
		a1.deposit(amount);
		
		System.out.println("Enter Amount for WithDrawal...");
		amount=sc.nextDouble();
		
		try 
		{
			a1.withdrawl(amount);
		}catch(NoBalanceInAccountException e)
		{
			System.out.println("Sorry, insufficient balance, you need more "+e.amount+"Rs. To perform this transaction. ");
		}
	}
}
