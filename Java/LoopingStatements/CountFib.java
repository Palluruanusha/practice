
import java.util.Scanner;
class CountFib 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int m=scn.nextInt();
		int a=0;
		int b=1;
		int c=a+b;
		int count=3;
		for(int i=count;i<=m;i++)
		{
			a=b;
			b=c;
			c=a+b;
			if(c<m)count++;
				if(c==m) 
			{
				count++;
				break;
			}
		}
			System.out.println(count);
	}
}

