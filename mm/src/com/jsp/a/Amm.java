package com.jsp.a;

public class Amm {
	public static void main(String[] args) {
		String alpha="";
		String num="";
		String s="AB17c6hI";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='A' && c<='Z') 
			{
				
				alpha+=(char)(c+32);
			}
			else if(c>='a' && c<='z')
				alpha+=(char)(c-32);
			else
				num=s;
		}
		
		System.out.println(alpha);
	}

}
