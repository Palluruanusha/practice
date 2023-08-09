package com.patterns.pack;

public class SnakePatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
		for(int i=1;i<=size;i++) {
			if(i%2!=0) {
				int n=((i-1)*size)+1;
				for(int j=1;j<=size;j++) {
					System.out.print(n+"\t");
					n++;
				}
			}
			else {
				int n=i*size;
				for(int j=1;j<=size;j++) {
					System.out.print(n+"\t");
					n--;
				}
			}
			System.out.println();
		}

	}
}
