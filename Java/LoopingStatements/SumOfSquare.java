import java.util.Scanner;
class SumOfSquare
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		//int m=scn.nextInt();
		int sum=0;
		int num=n;
		while(num>0)
		{
			int d=num%10;
			sum+=(d*d);
			num/=10;
		}
		System.out.println("sum of square=" +sum);
		//System.out.println("not a square=" +sum);
	}
}
			
