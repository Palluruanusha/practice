import java.util.Scanner;
class Pattern3
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int size=scn.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==j)
				{
				System.out.print("X");
			}
			}
			System.out.println();
		}
	}
}


