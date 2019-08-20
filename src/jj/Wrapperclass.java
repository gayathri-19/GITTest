package jj;

public class Wrapperclass {

	public static void main(String[] args) {
		String s= "20";
		System.out.println(100+s);
		int i= Integer.parseInt(s);
		System.out.println(i+100);
		Double d= Double.parseDouble(s);
		System.out.println(d+200);
		Boolean b=Boolean.parseBoolean(s);
		System.out.println(b);
		
		int k=100;
		String a=String.valueOf(k);
		System.out.println(a+200);

	}

}
