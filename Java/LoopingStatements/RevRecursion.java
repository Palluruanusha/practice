class  RevRecursion 
{
	public static void main(String[] args) 
	{
		int n=1807;
		System.out.println(revNum(n));
		//reverse(n);
	}
	static int revNum(int n)
	{
		int rev=0;
		while(n>0)
		{
			rev=rev*10+n%10;
			n/=10;
		}
		return rev;
	}
}
		/*if(n<10)
		{
			System.out.println(n);
			return;
		}
		else
		{
			System.out.print(n%10);
			Rev(n/10);
			System.out.println("reversed num");
			return rev(n);*/