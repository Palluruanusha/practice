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
class Binarytree1 
{
	private Node root=null;
	private int count=0;
	private boolean flag;
	private boolean removeFlag;
	public boolean add(int k)
	{
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
	public void postOrderTraverse() {
		postOrder(root);
		System.out.println();
	}
	private void postOrder(Node n) {
		if(n==null) return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+" ");
	}
	public void preOrderTraverse() {
		preOrder(root);
		System.out.println();
	}
	private void preOrder(Node n)
	{
		if(n==null) return;
		System.out.print(n.key+ " ");
		preOrder(n.left);
		preOrder(n.right);
	}
	public void inOrderTraverse()
	{
		inOrder(root);
		System.out.println();
	}
	private void inOrder(Node n) {
		if(n==null) return;
		inOrder(n.left);
		System.out.print(n.key+" ");
		inOrder(n.right);
	}
	public void remove(int key)
	{
		removeFlag=false;
		root=removeNode(root,key);
		if(removeFlag) count--;
	}
	 Node removeNode(Node n,int k) {
		if(n==null) return null;
		if(k<n.key) n.left=removeNode(n.left,k);
		else if(k>n.key) n.right=removeNode(n.right,k);
		else {
			removeFlag=true;
			if(n.left!=null && n.right!=null) {
				Node temp=getBiggestNode(n.left);
				n.key=temp.key;
				n.left=removeNode(n.left,temp.key);
			}
			else if(n.left!=null) n=n.left;
			else if(n.right!=null) n=n.right;
			else n=null;
		}
		return n;
	}
	private Node getBiggestNode(Node n)
	{
		if(n.right==null) return n;
		return getBiggestNode(n.right);
	}
}
class BinaryTree {

	public static void main(String[] args) 
	{
		Binarytree1 t=new Binarytree1();
		t.add(50);
		t.add(30);
		t.add(10);
		t.add(40);
		t.add(80);
		t.add(100);
		t.add(60);
		t.levelOrder();
		t.postOrderTraverse();
		t.preOrderTraverse();
		t.inOrderTraverse();
		t.add(110);
		t.inOrderTraverse();
		t.remove(60);
		t.inOrderTraverse();
		//System.out.println("Hello World!");
	}
}
