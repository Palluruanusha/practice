import java.util.Scanner;
class PositiveOrNegative 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		if(n>0)
		{
			System.out.println(n+ "Is positive number");
		}
		else
		{
		System.out.println(n+ "Is negative number");
		}
	}
}
