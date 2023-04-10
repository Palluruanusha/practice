import java.util.Scanner;
class ArmNumRange
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter lower and upper limit");
		int l=scn.nextInt();
		int u=scn.nextInt();
		for(int i=153;i<=200;i++)
		{
		int n=153;
		int count=0;
		while(n>0)
		{
			count++;
			n/=10;
		}
		}
		int sum=0;
		n=i;
		while(n>0)
		{
			int prod=1;
		for(int j=1;j<=count;j++)
		{
			int d=n%10;
			prod*=d;
		}
		sum+=prod;
		n/=10;
		}
		if(sum==num)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a armstrong number");
		}
}

			