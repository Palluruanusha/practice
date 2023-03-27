import java.util.Scanner;
class ReverseNum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int num=0,r;
		int rev=0;
		for( ;n!=0; )
		{
			rev*=10;
			rev+=(n%10);
			n/=10;
		}
		System.out.println("Reverse of number is" +rev);
	}
}