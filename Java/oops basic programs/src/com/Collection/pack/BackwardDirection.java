package com.Collection.pack;

import java.util.ArrayList;

public class BackwardDirection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s=new ArrayList<String>();
		s.add("zing");
		s.add("Anu");
		s.add("Lav");
		s.add("Chanu");
		s.add("Pranav");
		s.add("Amara");
		java.util.ListIterator<String> i=s.listIterator();
		while(i.hasPrevious())
			System.out.println(i.previousIndex());
			System.out.println(i.previous());
		}
}
