import java.util.Scanner;
class PositiveOrNegative 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter year");
		int n=scn.nextInt();
		if(n%4OO==0) || (n%4==0 && n%100!=0)
		{
			System.out.println("Leap year");
		}
		else
		{
		System.out.println(n+ "Not a leap year");
		}
	}
}
