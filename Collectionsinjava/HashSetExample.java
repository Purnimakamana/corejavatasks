package Collectionsinjava;
import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Rahul");
		set.add("Ravi");
		set.add("Ajay");
		set.add("Ravi");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
