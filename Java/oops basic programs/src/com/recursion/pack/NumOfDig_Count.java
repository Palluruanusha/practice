package com.recursion.pack;

public class NumOfDig_Count {
	public static void main(String[] args)
	{
		int n = 1234;



		System.out.println(sum(n));
		}
		static int sum (int num)
		{
		if (num != 0)
		{
		    return (num % 10 + sum (num / 10));
		}
		else
		{
		   return 0;
	}
		}
}
