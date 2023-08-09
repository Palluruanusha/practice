import java.util.Scanner;
class ArmNumRange
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter lower and upper limit");
		int l=scn.nextInt();
		int u=scn.nextInt();
		for(int i=l;i<=u;i++)
		{
		int num=0;
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		}
		int sum=0;
		int i=1;
		int n=i;
		while(n>0)
		{
			int prod=1;
			int count=0; 
		for(int j=1;j<=count;j++)
		{
			int d=n%10;
			prod*=d;
		}
		sum+=prod;
		n/=10;
		}
		if(sum==n)
			System.out.println("Armstrong number");
		//else
			//System.out.println("Not a armstrong number");
		}
}

			