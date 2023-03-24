import java.util.Scanner;
class FibSeries 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int a=0;
		int b=1;
		int c=0;
		if(n==1)
		{
			System.out.print(a);
			return;
		}
		System.out.print(a+ " " +b);
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
		}
	}
}

