package jj;

public class localandglobalvariables {
	int mod=2014;
	static int wheel=4;
	public static void main(String[] args) {
		int a=1;
		char apple='a';
		System.out.println(a);
		System.out.println(apple);
		localandglobalvariables obj1=new localandglobalvariables();
		String s=obj1.met1();
	System.out.println(s);
		System.out.println(wheel);
		int j=obj1.mod;
		int i=obj1.wheel;
		System.out.println(j);
		met2();//static method
		localandglobalvariables.met2();
		obj1.met1(78);
		

	}

	public String met1()
	{
	
	String s="selenium";
	return s;
		
	}
	
	public static void met2()
	{
		System.out.println("static method");
		int x=40;
		int y=20;
		int z=x/y;
		System.out.println(z);
	}
	public void met1(int d)
	{
		System.out.println(d);
		
		
	}
	

}