package com.patterns.pack;

public class DimondPatt {

	public static void main(String[] args) {
		int n=7;
		int sp=n/2;
		int st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) System.out.print(" ");
			for(int j=1;j<=st;j++) System.out.print("*");
			System.out.println();
			if(i<=n/2) {
				st+=2;
			sp--;
			}
		
			else 
				st-=2;
				sp++;
		}
		}
		

	}


