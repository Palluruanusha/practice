import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		import java.util.Scanner;Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=scn.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println("factorial of" +n+ "=" +fact);
	}
}
