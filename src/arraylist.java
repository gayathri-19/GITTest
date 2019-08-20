import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		ArrayList ar= new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add("selenium");
		ar.add("string");
		
		System.out.println(ar.size());

	System.out.println(ar.get(2));	
	ArrayList<String> ar1= new ArrayList<String>();
	ar1.add("selenium");
	ar1.add("string");
	
	for(int i=0; i<ar.size(); i++)
	{
		System.out.println(ar.get(i));
	}
	
	}

}
