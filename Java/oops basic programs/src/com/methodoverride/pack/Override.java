package com.methodoverride.pack;

class Parent
{
	public void call()
	{
		System.out.println("9999999999");
	}
}
class Child extends Parent
{
	public void call()//method overriding
	{
		System.out.println("8888888888");
	}
}
public class Override {
	public static void main(String[] args)
	{
		Child c1=new Child();
		c1.call();
	}

}
