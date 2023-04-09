import java.util.Scanner;
class Oct_Dec 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int d=0
			;
		int oct=116;
		int i=0;
		while(oct!=0)
		{
			 d=d+((oct%10)*i);
			d/=8;
			++i;
			oct/=10;
		}
		System.out.println(d);
	}
}
		

