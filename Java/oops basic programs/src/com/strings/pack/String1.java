package com.strings.pack;

public class String1 {
	public static void main(String[] args)
	/*{
		String s="Anu";
		String s1=new String(s);
		String s2=new String(s1);
		System.out.println(s1==s2);//false
		System.out.println(s2.equals(s1));//true
	}*/
	/*{
	String s ="java";
	String s1= s+"developer";
	String s2="java developer";
	System.out.println(s1==s2);//false
	System.out.println(s2.equals(s1));//true
}*/
	/*{
		String s="java";
		String s1="java"+"dev";
		String s2="javadev";
		System.out.println(s1);//javadev
		System.out.println(s2);//javadev
		System.out.println(s1==s2);//true
		System.out.println(s2.equals(s1));//true
	}*/
	{
		String s="java";
		String s1="dev";
		String s2="s+s1";
		String s3=new String(s2);
		System.out.println(s2==s3);//javadev
		System.out.println(s2.equals(s3));//javadev
		String s4="javadev";
		System.out.println(s3==s4);//javadev
		
		
	}
}
