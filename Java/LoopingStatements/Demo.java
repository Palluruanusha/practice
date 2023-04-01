class Demo 
{
	public static void main(String[] args) 
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			/*if(i%3==0)
			{
				continue;
			}
		}*/
			for(j=1;j<=5;j++)
			{
				if(i%3==0)
					continue;
			}
		System.out.println(i+" "+j);
	}
	}
}

