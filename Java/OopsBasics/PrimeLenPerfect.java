class Number 
{
	int num;
	boolean isPrime()
	{
		if(num<=1) return false;
			for(int i=2;i<=num/2;i++) {
		if(num%i==0) return false;
	}
	return true;
	}
	int length()
	{
		int count=0;
		int n=num;
		while(n>0) 
		{
			count++;
			n/=10;
		}
		return count;
	}
	boolean isPerfect()
	{
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) sum+=i;
	}
	return sum==num;
}
}
class PrimeLenPerfect
{
	public static void main(String[] args) 
	{
		Number obj1=new Number();
		obj1.num=4567;
		System.out.println("isPrime? "+obj1.isPrime());
		System.out.println("length= "+obj1.length());
		System.out.println("isPerfect? "+obj1.isPerfect());
	}
}
