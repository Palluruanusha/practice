import java.util.Scanner;
class LongFact 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=scn.nextInt();
		long fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println("factorial of" +n+ "=" +fact);
	}
}


