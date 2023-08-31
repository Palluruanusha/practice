package com.Sortings.pack;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {15,16,6,8,2,7,3,6,5};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));

	} 
	public static void sort(int []a) {
		for(int i=0;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1] =a[j];
				j--;
			}
			a[j+1]=key;
			}

	}

}
