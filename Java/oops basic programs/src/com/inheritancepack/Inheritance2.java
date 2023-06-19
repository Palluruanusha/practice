package com.inheritancepack;
class A
{
	int i;
}
class B extends A
{
	int j;
public void display()
{
	System.out.println(i+" "+j);//10 20
}
}
public class Inheritance2 {
	public static void main(String[] args)
	{
		B b1=new B();
		b1.i=10;
		b1.j=20;
		System.out.println(b1.i);//10
		System.out.println(b1.j);//20
		b1.display();
		
	}
}
