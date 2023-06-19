package com.inheritancepack;
class A2
{
	int i=5;
	public void m1()
	{
		System.out.println("Data" +i);
	}
}
class A3 extends A2
{
	int j=10;
	public void m2()
	{
		System.out.println("i" +i +"j" +
	j);
	}
}
public class Object2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 a=new A3();
		System.out.println(a.i);
		a.m1();
		System.out.println(a.j);
		a.m2();

	}

}
