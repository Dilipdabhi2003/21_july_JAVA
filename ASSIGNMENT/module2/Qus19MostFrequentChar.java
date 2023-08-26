package com.module2;

//W.A.J.P to find the second most frequent character in a given string. The given string
//is: successes The second most frequent char in the string is: c

public class Qus19MostFrequentChar 
{
	static final int Chars =256;
	static char getSecondMostChar(String s1)
	{
		int[] ctr = new int[Chars];
		for(int i=0;i<s1.length();i++)
		{
			ctr[s1.charAt(i)]++;
		}
		int ctr_first = 0, ctr_second = 0;
		  for ( int i = 0; i < Chars; i++) 
		  {
			   if (ctr[i] > ctr[ctr_first])
			   {
			    ctr_second = ctr_first;
			    ctr_first = i;
			   }
			   else if 
			   (ctr[i] > ctr[ctr_second] && ctr[i] != ctr[ctr_first])
			    ctr_second = i;
			   
		  }
		  return (char) ctr_second;
	}
	public static void main(String[] args) 
	{
		String s1 = "successes";
		  System.out.println("The given string is: " + s1);
		  char res = getSecondMostChar(s1);
		  if (res != '\0')
		   System.out.println("The second most frequent char in the string is: " + res);
		  else
		   System.out.println("No second most frequent character found in the string.");

	}
}
