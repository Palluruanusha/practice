package com.basicPrograms.pack;

public class Pallindrome {
	public static void main(String[] args) {
		int n=121;
		int r;
		int sum=0;
		int temp = n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n/=10;
		}
		if(temp==sum) {
		System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}
}

