package com.pack2;
class A
{
	static int i;
	{
		System.out.println("Hi");
	}
}
public class BLocks {
	public static void main(String[] args) {
		System.out.println(A.i);
		new A();
	}
}
