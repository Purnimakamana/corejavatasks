package Collectionsinjava;
import java.util.*;

public class VectorCollectionExample {
	public static void main(String[] args) {
		Vector<String>v=new Vector<String>();
		v.add("anu");
		v.add("sitha");
		v.add("Banana");
		v.add("Green");
		Iterator<String>itr=v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
