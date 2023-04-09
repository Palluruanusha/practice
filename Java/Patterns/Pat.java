import java.util.Scanner;
class Pat
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=scn.nextInt();
		//System.out.println("Enter number");
		for(int i=1;i<=n;i++)
			
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1 || j==2*i-1 || i==n)
					System.out.print("X");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}



	}

