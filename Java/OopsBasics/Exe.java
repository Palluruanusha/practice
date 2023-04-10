class Exe
{
	static int m1()
	{
		System.out.println("executing m1()");
		return 2;
	}
	public static void main(String[] args) 
	{
		m1();
		int i=m1();
		System.out.println("i=" +i);
		int j=m1()+3;
		System.out.println("j=" +j);
		System.out.println(m1());
	}
}
