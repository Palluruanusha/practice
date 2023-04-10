import java.util.Scanner;
class SumOfPrime 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Sum of prime numbers");
		int n=scn.nextInt();
		//int m=scn.nextInt();
		int sum=0;
		int count=0;
		int i,j;
		for(i=2;i<=n;i++)
		{
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				sum+=i;
			}
		}
		System.out.println("\nSum of all Prime Numbers" +sum);
	}
}
