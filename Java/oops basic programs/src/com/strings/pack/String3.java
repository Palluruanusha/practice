package com.strings.pack;

public class String3 {
	    public static void main(String[] args) {
	        String input = "Anu@124";
	        int sum = getSumOfNumbers(input);
	        System.out.println("Sum = " + sum);
	    }

	    public static int getSumOfNumbers(String input) {
	        int sum = 0;
	        int numStart = -1;
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (Character.isDigit(ch)) {
	                if (numStart == -1) {
	                    numStart = i;
	                }
	            } else {
	                if (numStart != -1) {
	                    sum += Integer.parseInt(input.substring(numStart, i));
	                    numStart = -1;
	                }
	            }
	        }

	        if (numStart != -1) {
	            sum += Integer.parseInt(input.substring(numStart));
	        }

	        int i = sum;
			return i;
	    }
	}
