package com.Sortings.pack;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {15,16,6,8,2,7,1};
		System.out.println(Arrays.toString(a));
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));

	} 
	public static void sort(int []a,int start, int end) {
		if(start>=end) return;
		int pivot=a[(start+end)/2];
		int i=start, j=end;
		while(a[i]<pivot) {
			i++;
			while(a[j]>pivot)j--;
			if(i<=j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		sort(a,start,j);
		sort(a,i,end);																																																																		
	}

}
