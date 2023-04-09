import java.util.Scanner;
class PrimeRange 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Lower and Upper limit");
		int a=scn.nextInt();
		int b=scn.nextInt();
		for(int i=b;i>=a;i--)
		{
			if(i<=1)
			{
				continue;
				boolean flag=true;
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						flag=false;
						break;
					}
				}
				if(flag)
					System.out.println(i);
				break;
			}
		}
		}
		}
	
