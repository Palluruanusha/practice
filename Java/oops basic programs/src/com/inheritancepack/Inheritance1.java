package com.inheritancepack;
class C
{
	static
	{
		System.out.println("Static block1 of  class C");
	}
	{
		System.out.println("Non-static block1 of  class C");
	}
	{
		System.out.println("Non-static block2 of  class C");
	}
}
class D extends C
{
	static
	{
		System.out.println("Static block1 of  class D");
	}
	{
		System.out.println("Non-static block1 of  class D");
	}
}
public class Inheritance1 {
	public static void main(String[] args)
	{
		new D();
		new D();
		new D();
	}

}
