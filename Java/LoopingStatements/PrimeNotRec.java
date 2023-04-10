class  PrimeNotRec 
{
	public static void main(String[] args) 
	{
		int n=7;
		System.out.println(isPrime(n, 2));
	}
	static boolean isPrime(int n,int d)
	{
		if(n==0 || n==1)
		{
			return false;
		}
			if(n==d)
		{
				return true;
		}
			if(n%d==0)
		{
				return false;
		}
				return isPrime(n,d+1);
	}
	}

