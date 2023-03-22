import java.util.Scanner;
class PositiveOrNegative1 
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
		else if(n<0)
		{
		System.out.println(n+ "Is Negative number");
		}
		else {
			System.out.println("Entered number Is 0");
		}
	}
}