import java.util.Scanner;
class Child
{
	int id;
	String name;
	int age;
	String phno;
	static String collegeName;
	static String collegeAddress;

	Child (int id, String name, int age, String phno)
	{
		this.id = id;
		this.name= name;
		this.age= age;
		this.phno= phno;
	}

	public void displayStudentDetails()
	{
		System.out.println("student ID: "+this.id);
		System.out.println("student Name:" +this.name);
		System.out.println("student Age: " +this.age);
		System.out.println("student Contact: " +this.phno);
		System.out.println("student College Name: " +this.collegeName);
		System.out.println("student College Address:" +this.collegeAddress);
		System.out.println("*********************************");
		System.out.print("\n");
	}

	public static void changeCollegeName(String collegeName)
	{
		Child.collegeName=collegeName;
	}

	public static void changeCollegeAddress(String collegeAddress)
	{
		Child.collegeAddress=collegeAddress;
	}
public static Child getStudent()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Student Id: ");
	int id=scan.nextInt();

	System.out.println("Enter Student Name: ");
	String name=scan.next();

	System.out.println("Enter Student Age:");
	int age=scan.nextInt();

	System.out.println("Enter Student Contact: ");
	String phno=scan.next();

	return new Child(id, name, age, phno);
}

class StudentDetails {
	public static void main(String[]args)
	{
		Child.collegeName="Jsp";
		Child.collegeAddress="OAR";

		Child s1= Child.getStudent();
		s1.displayStudentDetails();

		Child s2=Child.getStudent();
		s2.displayStudentDetails();

		Child.changeCollegeName("jspiders");
		Child.changeCollegeAddress("Marathalli");

		s1.displayStudentDetails();
		s2.displayStudentDetails();
	}
}	
}