import java.util.Scanner;
class SumOfDigits
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=scn.nextInt();
		int num=scn.nextInt();
		int num=n;
		int sum=0,r=0;
		for( ;n>0; )
		{
			r=n%10;
			sum=sum+r;
			n/=10;
		}
		System.out.println("sum of digits" +num+ " = " +sum);
	}
}
