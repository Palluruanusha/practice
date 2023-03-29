import java.util.Scanner;
class NivenNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int sum=0,temp=n;
		while(n>0)
		{
			int d=n%10;
			sum+=d;
			n/=10;
		}
		if(temp%sum==0)
		{
			System.out.println("I am niven");
		}
				else
			{
				System.out.println("I am not niven");
			}
		}
}


