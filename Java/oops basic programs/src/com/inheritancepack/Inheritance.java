package com.inheritancepack;
class Single
{
	static int i=100;
	static void m1()
	{
		System.out.println("Static method");
	}
}
class Inherit extends Single
{
	
}
public class Inheritance {
	public static void main(String []args)
	{
		System.out.println(Single.i);//100
		System.out.println(Inherit.i);//100
		Single s=new Single();
		System.out.println(Single.i);//100
		Inherit i=new Inherit();
		System.out.println(Inherit.i);//100
		Single.m1();//Static method
		Inherit.m1();//Static method
		s.m1();//Static method
		i.m1();//Static method
		
	}

}
