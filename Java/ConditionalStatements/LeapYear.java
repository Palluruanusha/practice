import java.util.Scanner;
class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Year");
		int y=scn.nextInt();
		if(y % 400==0 || y % 4==0 && y % 100!=0)
		{
			System.out.println("Leap year");
		}
		else
		{
		System.out.println("Not a leap year");
		}
	}
}

