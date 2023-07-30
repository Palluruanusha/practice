package com.strings.pack;

public class Anagram {
	public static void main(String[] args) {
		String s1="listen";
		//String s="listen";
		//String s1="netsil";
		if(is_Anagram(s1))
		{
			System.out.println("The given string id anagram");
		}
	}

	private static boolean is_Anagram(String s1) {
		while(true)
		{
			//String s1="listen";
			String s2="netsil";
			if(s1.length()!=s2.length())
			return false;
			if(s1.length()==0 && s2.length()==0)
				return true;
			char c=s1.charAt(0);
			s1=s1.replace(c+"","");
			s2=s2.replace(c+"","");
		}
		
	}

}
