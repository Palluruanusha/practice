class PatternNum5
{
	public static void main(String[] args) 
	{
		//int n=0;
		int k=1;
		for(int i=1; i<=5; i++)
		{
			if(i==1)
			{
				k+=1;
			for(int j=1; j<=5; j++)
			{
				k--;
		System.out.print(k);
	}
			}
	else
				{
		k-=1;
		for(int j=1;j<5;j++)
					{
			k++;
			System.out.print(k);
					}
				}
				k+=5;

	System.out.println();
		}
	}

}

