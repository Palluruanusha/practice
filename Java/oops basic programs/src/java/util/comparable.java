package java.util;
//import com.arrays.pack.Comparable;
//import com.arrays.pack.Emp;

class Emp implements Comparable<Object> {
	String name;
	int id;
	double sal;
	private static int num=1000;
	Emp(String n, double s) {
		name=n;
		sal=s;
		id=num++;
	}
	public String toString() {
		return"Emp[name="+name+",id="+id+",sal="+sal+"]";
	}
	public int compareTo(Object o) {
		Emp arg=(Emp)o;
		return name.compareTo(arg.name);
	}
}

public class comparable {

	public static void main(String[] args) {
		Emp [] arr= {
				new Emp("Anusha", 45679.0),
				new Emp("Lav", 35679.0),
				new Emp("chanu", 69679.0),
				new Emp("pranav", 73679.0),
				new Emp("skanda", 80679.0),
				
		};
		Arrays.sort(arr);
		for(Emp e:arr) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}