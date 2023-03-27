
import java.util.Scanner;
class PrimeNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		if(n<2)
		{
			System.out.println(n+"Is not a prime");
			return;
		}
		for(int i= 2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+"Is not a prime");
				return;
			}
		}
		System.out.println(n+"Is prime");
	}
}
		