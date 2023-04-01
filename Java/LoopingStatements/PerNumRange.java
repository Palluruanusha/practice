import java.util.Scanner;
class PerNumRange
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter lower and upper limit");
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		//int sum=0; fact=1;
		int count=0;
		for(int i=num1;i<=num2;i++)
		{
			int n=i;
			int sum=0;
			int fact=1;
			/*for(j=1;j<=n-1;j++)
			{*/
			//System.out.println("Perfect numbers are:");
			while (fact<=n/2)
			{
				if((n%fact)==0)
				{
					sum=sum+fact;
				}

				
				fact++;
			}
			
			if(sum==i)
			{
				count++;
				System.out.println("total perfect numbers is:"+count);
			}
		}
	}
}