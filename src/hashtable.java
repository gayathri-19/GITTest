import java.util.Hashtable;
public class hashtable {

	public static void main(String[] args) {
		Hashtable ht= new Hashtable();
		ht.put(1, "Name");
		ht.put('a', 20);
		ht.put('b', "string");
		System.out.println(ht.size());
			System.out.println(ht.get(1));
			Hashtable<Integer, Integer> ht1= new Hashtable<Integer,Integer>();
			ht1.put(1, 10);
			ht1.put(2, 20);
			System.out.println(ht1.size());
	}

}
