import java.util.Scanner;
class ATMProgram 
{
	public static void main(String[] args) 
	{
		int a, r2000=0, r500=5, r200=2, r100=9, r50=5, count=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Amount");
		int amt=scn.nextInt();
		if (amt>=2000)
		{
			r2000 = amt/2000;
			amt = amt%2000;
			System.out.println("Total number of 2000 notes" +r2000);
		}
		if (amt>=500)
		{
			r500 = amt/500;
			amt = amt%500;
			System.out.println("Total number of 500 notes" +r500);
		}
		if (amt>=200)
		{
			r100 = amt/200;
			amt = amt%200;
			System.out.println("Total number of 200 notes" +r200);
		}
		if (amt>=100)
		{
			r100 = amt/100;
			amt = amt%100;
			System.out.println("Total number of 100 notes" +r100);
		}
		if (amt>=50)
		{
			r100 = amt/50;
			amt = amt%50;
			System.out.println("Total number of 50 notes" +r50);
		}

	}
}
