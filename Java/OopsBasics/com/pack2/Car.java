package com.pack2;
class Car1 {
	static int cNo;
	static
	{
		cNo=1000;
	}
	{
		cNo++;
	}
	int cN0;
	String carName;
	String color;
	Car1(String carName)
	{
		this.cNo=cNo;
		this.carName=carName;
		color="white";
	}
	Car1(String carName, String color)
	{
		this.cNo=cNo;
		this.carName=carName;
		this.color=color;
	}
	public void carInfo()
	{
		System.out.println("car No: KA 01J" +cNo);
		System.out.println("car Name:" +carName);
		System.out.println("car color:" +color);
	}
}
public class Car {
	public static void main(String[] args)
	{
		Car1 car1=new Car1("AlTO");
		car1.carInfo();
		Car1 car2=new Car1("Brezza","navy blue");
		car2.carInfo();
		Car1 car3=new Car1("Baleno", "Grey black");
		car3.carInfo();
	}

}
