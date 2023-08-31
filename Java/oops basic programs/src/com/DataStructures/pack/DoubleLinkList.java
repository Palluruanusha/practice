package com.DataStructures.pack;

//import com.DataStructures.pack.NodeDLL.Node;
	public class DoubleLinkList {
	private Node First=null;
	private int count=0;
	public void add(Object e) {
		if(First==null) {
			First=new Node(e);
			count++;
			return;
		}
		Node curr=First;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(e,null,curr);
		count++;
	}
	public int size() {
		return count++;
	}
	public Object get(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr=First;
		for(int i=1;i<=index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}

public void add(int index, Object e) {
	if(index<=-1||index>=size()) {
		throw new IndexOutOfBoundsException();
		
	}
	if(index==0) {
		Node n=new Node(e,First,null);
		First.prev=n;
		First=n;
		count++;
		return;
	}
	Node curr=First;
	for(int i=1;i<index;i++) {
		curr=curr.next;
	}
	Node n=new Node(e,curr.next,curr);
	curr.next=n;
	n.next.prev=n;
	count++;

}
public void remove(int index) {
	if(index<=-1||index>=size()) {
		throw new IndexOutOfBoundsException();
		
}
	if(index==0) {
		First=First.next;
		First.prev=null;
		count--;
		return;
	}
	
	Node curr=First;
	for(int i=1;i<index;i++) {
		curr=curr.next;
	}  
	curr.next=curr.next.next;
	if(curr.next!=null)curr.next.prev=curr;
	count--;
}
}


	