import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int r,sum=0,temp;
		int num=n;
		temp=num;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n/=10;
		}
		if(temp==sum)
		System.out.println("Palindrome");
		else
			System.out.println("not a palindrome");


	}
}