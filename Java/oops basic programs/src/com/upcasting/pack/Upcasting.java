package com.upcasting.pack;
class D
{
	int i=100;
	public void m1()
	{
		System.out.println("Hi");
	}
}
class E extends D
{
	public void m2()
	
	{
		System.out.println("Hello");
	}
}
public class Upcasting {
	public static void main(String[]args) {
		D d=new E();
		System.out.println(d.i);
		d.m1();
		//System.out.println(a.j);
		//a.m2();
	}

}
