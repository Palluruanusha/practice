class  Arraylist
{
	private Object []a=new Object[5];
	private int p=0;
	public void add(Object e) {
		if(p>=a.length) increase();
		a[p++]=e;
	}
	public void add(int index, Object e) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(p>=a.length) increase();
		for(int i=size()-1;i>=index;i--) {
			a[i+1]=a[i];
		}
		a[index]=e;
		p++;
	}
	public void remove(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		for(int i=index+1;i<size();i++) {
			a[i-1]=a[i];
		}
		p--;
		a[p]=null;
	}
	public void increase() {
		Object[] temp = new Object[a.length+3];
		System.arraycopy(a,0,temp,0,a.length);
		a=temp;
	}
	public int size() {
		return p;
	}
	public Object get(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
}

class ArrayListremove {
	public static void main(String []args) {
		Arraylist a1=new Arraylist();
		a1.add("java");
		a1.add("c");
		a1.add("python");
		a1.add(2,"c++");
		a1.remove(0);
		for(int i=0;i<a1.size();i++) {
			String s=(String)a1.get(i);
			System.out.println(s);
		}
	}


}
