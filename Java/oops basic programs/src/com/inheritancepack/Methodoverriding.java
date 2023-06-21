package com.inheritancepack;
class Override
{
	public void wish()
	{
		
		System.out.println("Good Morning");
	}
}
class Method extends Override
{
	public void wish()
	{
		System.out.println("Good Evening");
	}
}
public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m=new Method();
		m.wish();

	}

}
