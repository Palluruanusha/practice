import java.util.Scanner;
class Pattern4
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int size=scn.nextInt();
		int i=1;
		int j=1;
		for(i=1;i<=size/2+1;i++)
		{


			for(j=1;j<=size/2+1;j++)
				{
				if(i==1 || i==size || j==1 || j==size || i==j || i+j==size+1)
				System.out.print("X ");
				else 
					System.out.print("  ");
				}
			System.out.println();
		}
	}
	
	
}


