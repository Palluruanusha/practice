package com.upcasting.pack;
class A2
{
	public static void m1()
	{
		System.out.println("M1 of A2");
	}
}
class B2 extends A2
{
	public static void m1()
	{
		System.out.println("M1 of B2");
	}
}
class C2 extends B2
{
	public static void m1()
	{
		System.out.println("M1 of C2");
	}
}
class D2 extends B2
{
	public void m2()
	{
		System.out.println("M1 of D2");
	}
}

public class Upcasting1 {
	public static void main(String[] args) {
		A2 a=new B2();
		a.m1();
		A2 b=new C2();
		b.m1();
		B2 c=new C2();
		c.m1();
		B2 d =new D2();
		d.m1();
		//d.m2(); 

	}

}
