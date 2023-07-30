package com.strings.pack;

public class String2 {
	public static void main(String[] args)
	{
		String s= "Anu@124";
		//int sum=getSumOfNumbers(s);
		System.out.println();
	}
	public static void sum(String s)
	{
		int sum=0;
		int startNum=1;
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(startNum==1)
			{
				startNum=i;
			}
			else
			{
				if(startNum!=1) {
				
				}
			}
		}
	}

}
