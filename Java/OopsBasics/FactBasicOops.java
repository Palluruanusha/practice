class FactBasicOops 
{
	public static void main(String[] args) 
	{
		int res=fact(4);
		System.out.println("fact=" +res);
	}
	static int fact(int n)
	{
		int prod=1;
		for(int i=1;i<=n;i++)
		{
			prod*=i;
		}
		return prod;
	}
}
