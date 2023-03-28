import java.util.Scanner;
class FibGivenRange
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
		if (n==0)
		{
		System.out.print(a+ " " +b);
		}
		for(;;)
		{
			c=a+b;
			if(c<=m)
			{
				System.out.print(" " +c);
			if(c>=n)
			{
				System.out.print("count of numbers in range is" +n);
				break;
			}
			a=b;
			b=c;
			}
		} 
	}
}
