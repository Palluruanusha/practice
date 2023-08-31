package com.DataStructures.pack;
//Single linked list
/*public class Node {
	Object ele;
	Node next;
	Node(Object e){
		ele=e;
		next=null;
	}
	Node (Object e, Node n){
		ele=e;
		next=n;
		// TODO Auto-generated method stub

	}

}*/
public class Node {
	Object ele;
	Node next;
	Node prev;
	Node(Object e){
		ele=e;
		next=null;
		prev=null;
	}
	Node (Object e, Node n,Node p){
		ele=e;
		next=n;
		prev=p;
		// TODO Auto-generated method stub

	}
}

