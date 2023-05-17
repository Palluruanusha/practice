class Rectangle 
{
	int length;
	int breadth;
	void initialize(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		System.out.println("Rectangle obj is initialized");
	}
	void area()
	{
		System.out.println("Area= "+(this.length*this.breadth));
	}
	void perimeter()
	{
		int p=2*(this.length + this.breadth);
		System.out.println("Perimeter= " +p);
	}
	void displayDimensions() 
	{
		System.out.println("length= "+this.length);
			System.out.println("breadth= "+this.breadth);
	}
}
class Rect1
{
	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle();
		r1.initialize(20,40);
		r1.displayDimensions();
		r1.area();
		r1.perimeter();
		//System.out.println("Hello World!");
	}
}
