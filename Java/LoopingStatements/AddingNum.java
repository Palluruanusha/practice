import java.util.Scanner;
class AddingNum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=scn.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("sum of 1 to" +n+ "=" +sum);
	}
}
