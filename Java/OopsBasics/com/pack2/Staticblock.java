package com.pack2;
class Static1
{
	static int i;
	static 
	{
		System.out.println("Static block");
	}
}
public class Staticblock {
	public static void main(String[] args) {
		System.out.println("Hijava");
		new Static1();
	}
}