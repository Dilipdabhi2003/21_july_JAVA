package com.module2;

//We have to calculate the percentage of marks obtained in three subjects (each out of
//100) by student A and in four subjects (each out of 100) by student B. Create an
//abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two
//other classes 'A' and 'B' each having a method with the same name which returns the
//percentage of the students. The constructor of student A takes the marks in three
//subjects as its parameters and the marks in four subjects as its parameters for student
//B. Create an object for each of the two classes and print the percentage of marks for
//both the students.
abstract class Marks
{
	 public abstract float getParcentage();
}
class StudentA extends Marks
{
	float sub1=87,sub2=76,sub3=94;
	public void StudentA(float sub1,float sub2,float sub3) 
	{
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	@Override
	public
	float getParcentage()
	{
		// TODO Auto-generated method stub
		float avg=(sub1+sub2+sub3)/3;
		return avg;
	}
	
}
class StudentB extends Marks
{
	float sub1=78,sub2=90,sub3=89,sub4=91;
	public void StudentB(float sub1,float sub2,float sub3,float sub4) 
	{
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
	}
	@Override
	public
	float getParcentage()
	{
		// TODO Auto-generated method stub
		float avg=(sub1+sub2+sub3+sub4)/4;
		return avg;
	}
	
}

public class Qus30AbstractMark 
{
	public static void main(String[] args) 
	{
		StudentA s1=new StudentA();
		System.out.println("Student A get "+s1.getParcentage()+"% Parcentage");
		
		StudentB s2=new StudentB();
		System.out.println("Student A get "+s2.getParcentage()+"% Parcentage");
	}
}
