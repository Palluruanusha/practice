import java.util.Scanner;
class DecBin 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int bin=0;
		int d=51;
		int i=1;
		while(d>0)
		{
			int rem=d%2;
			bin+=rem*i;
			i*=10;
			d/=2;
		}
		System.out.println(bin);
	}
}
