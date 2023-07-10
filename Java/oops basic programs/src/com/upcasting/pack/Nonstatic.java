package com.upcasting.pack;
class A
{
	public void m1()
	{
		System.out.println("M1 of A");
	}
}
class B extends A
{
	public void m1()
	{
		System.out.println("M1 of B");
	}
}
class C extends B
{
	public void m1()
	{
		System.out.println("M1 of C");
	}
}
public class Nonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a;
		a=new B();
		a.m1();
		a=new C();
		a.m1();

	}
}
