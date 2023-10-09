package com.java8Features.pack;
interface I1 {
	//void m1() {
		default void m2() {
			System.out.println("Default  m2 method");//jdk 1.8
		}
		public static void m3() {
			System.out.println("Static method in interface");//jdk 1.8
		}
		static void m4() {
			System.out.println("private method in interface"); //jdk 1.9
		}
	}
public class JDKversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
