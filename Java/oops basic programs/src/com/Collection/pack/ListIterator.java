package com.Collection.pack;

import java.util.ArrayList;

public class ListIterator {

	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<String>();
		s.add("Zing");
		s.add("Anu");
		s.add("Lav");
		s.add("Chanu");
		s.add("Pranav");
		s.add("Amara");
		java.util.ListIterator<String> i=s.listIterator();
		while(i.hasNext()) {
			if(i.next().equals("Zing"))
			// or         if(i.next()=="Zing")
			i.set("Skanda");
		}
		System.out.println(s);
	}

}
