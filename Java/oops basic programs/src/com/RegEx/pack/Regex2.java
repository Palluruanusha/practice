package com.RegEx.pack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
	

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[ab]+");
		Matcher m=p.matcher("bbbbc");
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
		}

	}

}

