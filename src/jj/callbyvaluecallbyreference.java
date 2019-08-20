package jj;

public class callbyvaluecallbyreference {
	
	int p=100;
	int q=200;
		public static void main(String[] args) {
		callbyvaluecallbyreference obj= new callbyvaluecallbyreference();
		obj.stat(10, 20);//passbyvalue or callby value
		int x=100;
		int y=200;
		obj.stat(x,y);//passbyvalue or callby value
		obj.swap(obj);//callbyreference or passby reference
		System.out.println("afterswap");
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	public int stat(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		return c;
		
	}
	
	public void swap(callbyvaluecallbyreference objnew)
	
	{
		System.out.println("Call by reference");
		int temp;
		temp=objnew.p;
		objnew.p=objnew.q;
		objnew.q=temp;
		System.out.println(temp);
		
	}

}
