
import java.util.Scanner;
class FibCount 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Lower and Upper limit");
		int n=scn.nextInt();
		int m=scn.nextInt();
		int a=0;
		int b=1;
		int c=0;
		int count=0;
		for(;;) 
		{
		if(c>m)
		{
			break;
		}
		if(c>=n)
		{
			count++;
		}
		a=b;
		b=c;
		c=a+b;
	}
	System.out.println("count is" +count);
}
}
