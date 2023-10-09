package com.Collection.pack;

import java.util.ArrayList;
import java.util.Collections;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s=new ArrayList<String>();
		s.add("zing");
		s.add("Anu");
		s.add("Lav");
		s.add("Chanu");
		s.add("Pranav");
		s.add("Amara");
		java.util.Iterator<String> i=s.iterator();
		while(i.hasNext()) {
			String s1=i.next();
			if(s1.equals("zing")) i.remove();
		}
		System.out.println(s);
	}
}
		