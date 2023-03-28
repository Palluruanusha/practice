import java.util.Scanner;
class StrongNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		//int n=scn.nextInt();
		int num=scn.nextInt();
		int sum=0;
		int n=num;
		while(num>0)
		{
			int d=num%10;
			int fact=1;
			for(int i=1;i<=d;i++)
			{
				fact*=i;
			}
			sum+=fact;
			num/=10;
		}
			if(sum==n)
			{
				System.out.println("Strong number");
			}
			else {
				System.out.println("Not a strong number");
			}
		}
	}

