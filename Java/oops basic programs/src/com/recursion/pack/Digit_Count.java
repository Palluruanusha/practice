package com.recursion.pack;

public class Digit_Count {
	public static void main(String[] args) {

		// Input number
		int n = 123456789;

		// calling the recursive method
		int Count = countDigits(n);

		// printing the output
		System.out.println("No of digits in number " + n + " is " + Count);

	}
	public static int countDigits(int num) {

		if (num == 0) {
			return 0;
		}

		return 1 + countDigits(num / 10);
	}
}
