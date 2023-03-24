class SwapNum1 
{
	public static void main(String[] args) 
	{
		int a=2;
		int b=3;
		System.out.println("a value is" +a);
		System.out.println("b value is" +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a value is" +a);
		System.out.println("b value is" +b);
	}
}
