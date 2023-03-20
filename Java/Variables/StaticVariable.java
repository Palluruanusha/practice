class StaticVariable 
{
	static int a=20;//staticvar
	public static void main(String[] args) 
	{
		int a=10;
		System.out.println(a);//Acessing local variable 
		System.out.println(StaticVariable.a);//Acessing static variable
	}
}
