package com.DataStructures.pack;
//Linked list
/*public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist l=new Linkedlist();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(0,40);
		l.add(2,50);
		l.remove(3);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}

	}

}*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkList dl=new DoubleLinkList();
		dl.add(10);
		dl.add(20);
		dl.add(30);
		//dl.add(0,40);
		dl.add(2,50);
		dl.remove(3);
		for(int i=0;i<dl.size();i++) {
			System.out.println(dl.get(i));
		}

	}

}
