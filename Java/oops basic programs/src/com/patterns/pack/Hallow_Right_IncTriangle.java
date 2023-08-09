package com.patterns.pack;

public class Hallow_Right_IncTriangle {

	public static void main(String[] args) {
		int size=5;
		for(int i=1;i<=size;i++) {
			//for(int j=1;j<=size;j++) 
			for(int j=i;j<=size;j++) {
				if(i==j||i==1||j==size) {
					System.out.print(" * ");
			}
			else {
				System.out.print("   ");
		}
			}
		System.out.println();
		// TODO Auto-generated method stub

	}

		}
	}
