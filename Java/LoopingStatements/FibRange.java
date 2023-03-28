import java.util.Scanner;
class FibRange
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter lower and upper limit");
		int n=scn.nextInt();
		int m=scn.nextInt();
		int a=0;
		int b=1;
		int c=0;
		int count = 10;
		System.out.print(a+ " " +b);
		for(int i=2;i<count;i++)
		{
			c=a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
		}
	}
}