package com.pack2;
class C
{
	static int i;
	{
		System.out.println("Non static block");
	}
	{
		System.out.println("Java");
	}
	{
		System.out.println("Core");
	}
	
}
public class Nonstaticblock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(C.i);
		C c1=new C();

	}

}
