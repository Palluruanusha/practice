package com.patterns.pack;

public class HallowRightIncTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1||i==j||i==size)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}
}


