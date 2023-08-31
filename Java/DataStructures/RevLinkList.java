 class Node {
	Object ele;
	Node next;
	Node(Object e){
		ele=e;
		next=null;
	}
	Node (Object e, Node n){
		ele=e;
		next=n;
	}
	}
	class RevList
	{
	
	private Node first=null;
		private int count=0;

		public void add(Object e) {
			if(first==null) {
				first=new Node(e);
				count++;
				return;
			}
			Node curr=first;
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
			Node curr=first;
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
			first=new Node(e,first);
			count++;
			return;
		}
		Node curr=first;
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
			first=first.next;
			count--;
			return;
		}
		
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}  
		curr.next=curr.next.next;
		count--;
	}
public void reverse() {
	Node prev=null,curr=first,next=null;
	while(curr!=null) {
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
	}
	first=prev;
	}
}
class RevLinkList {

	public static void main(String[] args) {
		RevList l=new RevList();
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
