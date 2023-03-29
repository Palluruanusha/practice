import java.util.Scanner;
class AutoMorpingNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int n=num;
		int d=1;
		while(n>0)
		{
			d*=10;
			n/=10;
		}
		System.out.println("d=" +d);
		int sq=num*num;
		System.out.println("sq=" +sq);
		if(sq%d==num)
			System.out.println("automorping number");
		else

			System.out.println("not automorping number");
	}
}
