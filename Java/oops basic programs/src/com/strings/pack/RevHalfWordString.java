package com.strings.pack;

public class RevHalfWordString {

	public static void main(String[] args) {
		String s1="knowledge";
		
		        //System.out.println("Please enter the input 'knowledge': ");
		        if (s1.equalsIgnoreCase("knowledge")) {
		            String s2 = s1.substring(4) + s1.substring(0, 4);
		            System.out.println("s2 =" + s2);
		        //} else {
		           // System.out.println("Invalid input! The input should be 'knowledge'.");
		        }
	}
}
