class PerNumRangeeee
{
	public static void main(String[] args)
	{
		int s=1;
		int e=100;
		
		for(int i=s;i<=e;i++)
		{
			if(isPerNum(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean isPerNum(int i)
	{
		int sum=0;
		int d=1;
		while(d<i)
		{
			
			if(i%d==0)
			{
				sum+=d;
			}
			d++;
			
		}
		return sum==i;
	}
		
}
