package com.basicPrograms.pack;

public class CountNoOfDig {
	public static void main(String[] args)
	{
		int n=1234;
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		System.out.println("Count digits="+count);
	}

}
