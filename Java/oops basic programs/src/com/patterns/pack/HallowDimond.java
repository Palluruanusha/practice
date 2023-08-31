package com.patterns.pack;

public class HallowDimond {

	public static void main(String[] args) {
		int n=7;
		int sp=n/2;
		int st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) System.out.print(" ");
			for(int j=1;j<=st;j++) System.out.print("*");
			int j=0;
			if(j==1||j==st) {
				System.out.print("*");
			}
				else {
					System.out.print(" ");
			}
				System.out.println();
			sp--;
			st+=2;
		}
			sp++;
			st-=2;
			}
	}
		

	

