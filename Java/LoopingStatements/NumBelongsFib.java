import java.util.Scanner;
class NumBelongsFib
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=scn.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			if(c==n || n==0)
			{
				System.out.print(n+ "belongs to fib series");
				break;
			}
			if(c>n)
			{
				System.out.print(n+ "not belongs to fib series");
				break;
			}
			a=b;
			b=c;
		}

	}
}
