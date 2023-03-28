import java.util.Scanner;
class ArmstrongNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		//int n=scn.nextInt();
		int num=scn.nextInt();
		int count=0;
		int n=num;
		//int n=0;
		while(num>0)
		{
			count++;
			num/=10;
			System.out.println("count=" +count);
		}
		num=n;
		int sum=0;
		while(num>0)
		{
			int d=num%10;
			int prod=1;
			for(int i=1;i<=count;i++)
			{
				prod*=d;
		
			System.out.println("prod=" +prod);
			}
			sum+=prod;
			num/=10;
		System.out.println("sum=" +sum); 
		}
		if(n==sum)
			System.out.println("It is a armstrong number");
		else
		System.out.println("Not a armstrong number");
	}
}


		
