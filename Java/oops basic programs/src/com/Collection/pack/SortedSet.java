package com.Collection.pack;
import java.util.*;

public class SortedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet s=new SortedSet();
		s.add(40);
		s.add(20);
		s.add(50);
		s.add(10);
		s.add(60);
		s.add(30);
		System.out.println("smallest="+s.first());
		System.out.println("biggest="+s.last());
		SortedSet s1=s.headSet(40);
		display(s1);
		SortedSet s2=s.tailSet(40);
		display(s2);
		SortedSet s3=s.subSet(20,50);
		display(s3);
	}
		static void display(SortedSet s) {
			for(Object O:s)
			{
				System.out.println(O+" ");
			}
			System.out.println();
	}

}
