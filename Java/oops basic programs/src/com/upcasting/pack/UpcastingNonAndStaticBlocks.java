package com.upcasting.pack;
class A3
{
	{
	System.out.println("non-static block of A3");
}
static
{
	System.out.println("Static block of A3");
}
A3()
{
	System.out.println("Constructor of A3");
}
}
class B3 extends A3
{
	{
	System.out.println("Non-static block of B3");
}
static
{
	System.out.println("Static block of B3");
}
B3()
{
	System.out.println("Constructor of A");
}
}
public class UpcastingNonAndStaticBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 a=new B3();
		B3 a1=new B3();

	}

}
