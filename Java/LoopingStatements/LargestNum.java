import java.util.Scanner;
class LargestNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int large=0;
		while(n>0)
		{
			int d=n%10;
			if(d>large)
			{
				large=d;
			}
			n/=10;
		}
		System.out.println("Largest num:" +large);
	}
}