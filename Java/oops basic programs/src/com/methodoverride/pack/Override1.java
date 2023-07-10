package com.methodoverride.pack;
class Phone
{
	String name;
	String  color;
	double price;
	int ram;
	Phone(String name, String color, double price, int ram)
	{
		this.name=name;
		this.color=color;
		this.price=price;
		this.ram=ram;
	}
	public void display()
	{
		System.out.println("Name:+name");
		System.out.println("Color:+color");
		System.out.println("Price:+price");
		System.out.println("Ram:+ram");

	}
}
class CameraPhone extends Phone
{
	int pixel;
	CameraPhone(String name, String color, double price, int ram,int pixel)
	{
		super(name,color,price,ram);
		this.pixel=pixel;
	}
	public void display()
	{
		super.display();
		System.out.println("Pixel:"+pixel);
	}
}
public class Override1 {
	public static void main(String[] args)
	{
		Phone p=new Phone("motorala","silver",23000,8);
		p.display();
		System.out.println("------------------------");
		CameraPhone cp=new CameraPhone("Samsung","grey",32000,16,40);
		cp.display();
	}
 
}

