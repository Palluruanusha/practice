package com.Sortings.pack;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter how man  elements to sort");
		int n=scn.nextInt();
		
		int[] a=new int[n];
		
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			a[i]=scn.nextInt();
		}
		mSort(a,0,a.length-1);
	}
	
	private static void mSort(int[] a, int i, int j) {
		if(i<j) {
			int mid =(i+j)/2;
			mSort(a,i,mid);
			mSort(a,mid+1,j);
			mSort(a,i,mid);
		}
	}
	public static void Sort(int []a,int lb,int mid,int ub) {
		int i=ub;
		int j=mid+1;
		int k=lb;
		int []b= new int [a.length];
		while(i<=mid && j<=ub) {
			if(a[i]<=a[j])
			{
				b[k++]=a[i++];
			}
			else {
				b[k++]=a[j++];
		}
		if(i>mid) {
			b[k++]=a[j++];
		}
			else {
				while(j<=mid) {
					b[k++]=a[i++];
				}
			}
			for(i=lb;i<=ub;i++) {
				a[i++]=b[i++];
			}
		}
}
}