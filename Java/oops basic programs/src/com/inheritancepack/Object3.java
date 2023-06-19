package com.inheritancepack;
class A4
{
	A4(int i)
	{
		System.out.println("A4 constructor ececuted");
	}
}
class A5 extends A4
{
	A5()
	{
		super(10);
	}
}
public class Object3 {
	public static void main(String []args) {
		new A5();
		System.out.println();
	}

}
