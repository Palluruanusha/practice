package com.patterns.pack;

public class HallowBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=size;j++) {
				//if(i==1||j==1||i==size||j==size) {//Print hallow box
				//if(i==j||i+j==size+1) {//Print "X" pattern
				if(i==1||j==1||i==size||j==size||i==j||i+j==size+1) {//hallow dimond with "X" pattern
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
				System.out.println();
			}
		}

	}


