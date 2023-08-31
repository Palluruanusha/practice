package com.DataStructures.pack;

public class RevLinkList {
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
			curr.next=new Node(e);
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
			First=new Node(e,First);
			count++;
			return;
		}
		Node curr=First;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Node(e,curr.next);
		count++;

	}
	public void remove(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
			
	}
		if(index==0) {
			First=First.next;
			count--;
			return;
		}
		
		Node curr=First;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}  
		curr.next=curr.next.next;
		count--;
	}
public void reverse() {
	Node prev=null,curr=First,next=null;
	while(curr!=null) {
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
	}
	First=prev;
	}
}

