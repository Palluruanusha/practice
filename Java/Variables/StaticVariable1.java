class StaticVariable1
{
	static int a;
	public static void main(String[]args) 
	{
		System.out.println(a);
		a=1;
			System.out.println(StaticVariable.a);
		StaticVariable1.a=20;
		System.out.println(a);

	}
}