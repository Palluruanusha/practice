package com.patterns.pack;

public class PyramidPatt {
	public static void main (String[] args) {
		/*int n=5;
		int sp=n-1;
		int st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) System.out.print("   ");
			for(int k=1;k<=st;k++) System.out.print(" * ");
			System.out.println();
			sp--;
			st+=2;*/
			int n=7;
			int sp=1;
			int st=n;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=sp;j++) System.out.print("   ");
				for(int k=1;k<=st;k++) System.out.print(" * ");
				System.out.println();
				sp++;
				st-=2;
		}
	}

}
