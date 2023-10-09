package com.jdkversion.pack;

public class ObjForInnerClass {
	private int a=50;
	class Inner {
		public void m1() {
			System.out.println(a);//50
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method 1
		ObjForInnerClass a =new ObjForInnerClass();
		ObjForInnerClass.Inner b= a.new Inner();
		b.m1();//50
		//method 2
		ObjForInnerClass.Inner i=new ObjForInnerClass().new Inner();
		i.m1();//50
		//method 3
		new ObjForInnerClass().new Inner().m1();

	}

}
