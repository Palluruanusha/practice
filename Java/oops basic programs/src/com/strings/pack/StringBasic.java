package com.strings.pack;

public class StringBasic {

	public static void main(String[] args) {
		String s="Anu";
		String s1="Anu";
		System.out.println(s==s1);//true
		System.out.println(s.equals(s1));//true
		System.out.println("-----------");
		String s2=new String("Anu");
		System.out.println(s1==s2);//false
		System.out.println(s2.equals(s));//true
		System.out.println("------------");
		System.out.println(s1==s2);//false
		System.out.println(s2.equals(s1));//true  
		

	}

}
