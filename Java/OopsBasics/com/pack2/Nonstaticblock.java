package com.pack2;
class B
{
    static int i;
	static 
	{
		System.out.println("Non Static block");
	}
}
public class Nonstaticblock {
	public static void main(String[] args) {
		B b1=new B();
		System.out.println(B.i);
		new B();
	}
}