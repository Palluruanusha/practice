import java.util.Scanner;
class FibCountRange 
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
		int count=0;
		if(n==0)
		{
			System.out.print(a+ " " +b);
		}
		for(int i=count;i<=m;i++)
		{
			if(c<m)count+=n;
			{

				if(c==m) 
			{
					System.out.print(" "+c);
				break;
			}
			c=a+b;
			a=b;
			b=c;
			
			System.out.print("count is" +count);
			break;
		}
		}

	}
}
