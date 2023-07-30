package com.inheritancepack;
class A1
{
	int i;
	void m1()
	{
		System.out.println(i);
		
	}
}
class B1 extends A1
{
	int j;
	void m2()
	{
		System.out.println(i);
		System.out.println(j);
	}
}
public class ExampleInheritance {
	public static void main(String []args)
	{
		B1 b=new B1();
		b.i=10;
		b.j=20;
		b.m1();
		b.m2();
	}

}
