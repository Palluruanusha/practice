import java.util.Scanner;
class SumOfEvenOdd
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		//int m=scn.nextInt();
		int sum1=0;
		int sum2=0;
		int num=n;
		while(num>0)
		{
			int d=num%10;
				if(d%2==0)
				
				sum1+=d;
				
				//System.out.println("sum of even num=" +sum1);
				
				else
			
					sum2+=d;
					num/=10;
			}
					System.out.println("sum of even num=" +sum1);
					System.out.println("sum of odd num=" +sum2);
				}
			}

