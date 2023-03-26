import java.util.Scanner;
class FibSeriesRange 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Lower and Upper limit");
		int n=scn.nextInt();
		int m=scn.nextInt();
		int a=0;
		int b=1;
		int c=0;
		if(n==0)
		{
			System.out.print(a+ " " +b);
		}
		for(;;)
		{
			c=a+b;
			if(c>m)
			{
				break;
			}
			if(c>=n)
			{
				System.out.print(" " +c);
			}
			a=b;
			b=c;
		}
	}
}
