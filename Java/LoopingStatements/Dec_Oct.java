import java.util.Scanner;
class Dec_Oct 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int d=123;
		int oct=0;
		int i=1;
		while(d>0)
		{
			int rem=d%8;
			oct+=rem*i;
			i*=10;
			d/=8;
		}
		System.out.println(oct);
	}
}
		
