class StaticVariable2
{
	static int a;
	public static void main(String[]args) 
	{
		int a=0;
		System.out.println(a);
		a=1;
			System.out.println(StaticVariable2.a);
		StaticVariable2.a=20;
		System.out.println(a);

	}
}