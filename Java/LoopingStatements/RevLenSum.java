import java.util.Scanner;
class RevLenSum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int key=scn.nextInt();
		int num=0;
		int d=0;
		int rev=0;
		int sum=0;
		while(n>0)
		{
			d*=10;
			d+=(n%10);
			n/=10;
		}
		System.out.println("Reverse of number is:" +rev);
		//System.out.println("Enter key value");
		while(key>0)
		{
			d*=10;
			sum+=d;
			rev/=10;
			key--;
		}
			System.out.println("Sum of two numbers is:" +sum);
		}
	}
