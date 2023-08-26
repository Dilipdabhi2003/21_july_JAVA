package com.module2;

import java.util.ArrayList;
import java.util.List;

//W.A.J.P to find all interleaving of given strings.
public class Qus18FindAllInterleaving 
{
	private static List<String> findinterleavings(String s1,String s2)
	{
		List<String> interleaving = new ArrayList<>();
		if(s1.isEmpty())
		{
			interleaving.add(s2);
			return interleaving;
		}
		
		if(s2.isEmpty())
		{
			interleaving.add(s1);
			return interleaving;
		}
		char char1= s1.charAt(0);
		List<String> interleaving1 =findinterleavings(s1.substring(1), s2);
		for(String interleaved:interleaving1)
		{
			interleaving.add(char1+interleaved);
		}
		
		char char2= s1.charAt(0);
		List<String> interleaving2 =findinterleavings(s1,s2.substring(1));
		for(String interleaved:interleaving2)
		{
			interleaving.add(char2+interleaved);
		}
		
		return interleaving;
	}
	public static void main(String[] args) 
	{
		String s1="WX";
		String s2="YZ";
		 
		List<String> interleaving = findinterleavings(s1, s2);
		System.out.println("The Given String Are :"+s1+" "+s2);
		System.out.println("The Interleaced string Are :"+interleaving);
	}
}
