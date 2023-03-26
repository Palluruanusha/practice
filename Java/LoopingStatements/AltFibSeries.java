
import java.util.Scanner;
class AltFibSeries 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int a=0;
		int b=1;
		int c=0;
		boolean flag=true;
		System.out.print(a);
		for(int i=3;i<=n*2;i++)
		{
			c=a+b;
			if(flag==true)
			{
				System.out.print(c);
				flag=false;
			}
			else
			{
				flag=true;
			}
			a=b;
			a=c;
		}
		
	}
}

