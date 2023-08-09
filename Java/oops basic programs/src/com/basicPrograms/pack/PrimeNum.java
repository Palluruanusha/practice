package com.basicPrograms.pack;

public class PrimeNum { 
	public static void main(String[] args) {
		int n=29;
		/*boolean flag=false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
			flag=true;
				break;
			}
		}
			if(!flag) {
			System.out.println(n+"is a prime");
		}
		else {
			System.out.println(n+"not a prime");     or      */
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(n+"is a prime");
		}
		else {
			System.out.println(n+"not a prime");
		}
		
	}
}
