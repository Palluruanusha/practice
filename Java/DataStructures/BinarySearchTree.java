import java.util.Queue;

import java.util.LinkedList;

class Node {
	int key;
	Node left,right;

	Node(int k) {
		key=k;
	}
	Node(int k,Node l, Node r) {
		key=k;
		left=l;
		right=r;
	}
}
class Binarysearchtree 
{
	private Node root=null;
	private int count=0;
	private boolean flag;
	public boolean add(int k) {
		flag=true;
		root=addNode(root, k);
		return flag;
	}
	private Node addNode(Node n,int k) {
		if(n==null) {
			n=new Node(k);
			count++;
			return n;
		}
		if(k<n.key) {
			n.left=addNode(n.left,k);
		}
		else if(k>n.key) {
			n.right=addNode(n.right,k);
		}
		else
			flag=false;
		return n;
	}
	public int size() {
		return count;
	}
public void levelOrder() {
	Queue<Node> q=new LinkedList<Node>();
	if(root!=null)q.add(root);
	while(!q.isEmpty()) {
		Node n=q.poll();
		System.out.print(n.key+" ");
		if(n.left!=null)q.add(n.left);
		if(n.right!=null)q.add(n.right);
		}
	System.out.println();
	}
}

class BinarySearchTree {

	public static void main(String[] args) 
	{
		Binarysearchtree t=new Binarysearchtree();
		t.add(50);
		t.add(30);
		t.add(10);
		t.add(40);
		t.add(80);
		t.add(100);
		t.add(60);
		t.levelOrder();
		//System.out.println("Hello World!");
	}
}
