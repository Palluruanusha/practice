package com.arrays.pack;

public class BasicaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) int [] a={2, 3, 4, 5, 6};
		int [] a=new int[5];
	   a[0]=10;
		a[1]=20;
		a[2]=30; 
		a[3]=40;
		a[4]=50;
		/* 3)for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);*/
			//instead of usin for loop we can use for each loop also
		for(int e:a)
		{
			System.out.println(e);
		}

	}

}
