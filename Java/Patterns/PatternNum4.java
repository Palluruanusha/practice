class PatternNum4 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				if(i!=j)
		System.out.print("*");
		else
			//if(j%2!==0)
			System.out.print("*");
			
			System.out.print(j);
			//System.out.print("*");
	}
	System.out.println();
		}
	}
}
