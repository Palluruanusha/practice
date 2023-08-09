package com.patterns.pack;

public class Patt2 {
	public static void main(String []args) {
		int size=5;
		for(int i=1;i<=size;i++) {
			for(int j=i;j<=size;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
