class Arguments 
{
	public static void main(String[] args) 
	{
		m1(3);
		int n=5;
		m1(n);
		m1(n+3+5);
	}
	static void m1(int a)
	{
		System.out.println("a=" +a);
	}
}
