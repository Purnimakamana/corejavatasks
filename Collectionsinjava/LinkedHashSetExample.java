package Collectionsinjava;
import java.util.*;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		set.add("Vani");
		set.add("Valli");
		set.add("Vani");
		set.add("Swathi");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
