package com.DataStructures.pack;

public class RevLinktest {

	public static void main(String[] args) {
		RevLinkList l=new RevLinkList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(0,60);
		l.add(2,70);
		l.remove(3);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("--------------");
		l.reverse();
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}

	}

}
