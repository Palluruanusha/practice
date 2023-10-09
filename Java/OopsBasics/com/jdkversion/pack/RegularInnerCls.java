package com.jdkversion.pack;

public class RegularInnerCls {
	int a=10;
	static int b=40;
	private int c=50;
	class Inner {
		public void m1() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);

		}
	}
	public void m2() {
		Inner i=new Inner();
		i.m1();
	}

	public static void main(String[] args) {
		RegularInnerCls r=new RegularInnerCls();
		r.m2();

	}

}
