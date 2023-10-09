package com.Collection.pack;

import java.util.ArrayList;
import java.util.Collections;

public class SortingOrderTreeSet {

	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<String>();
		s.add("zing");
		s.add("Anu");
		s.add("Lav");
		s.add("Chanu");
		s.add("Pranav");
		s.add("Amara");
		Collections.sort(s);
		for(String n:s)
		System.out.println(n);
		

	}

}
