package CollectionsTasks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/*Wite a Java program to create read only data using List, Set and Map in example*/

public class Problem1 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Vani");
		al.add("Valli");
		al.add("Swathi");
		al.add("Teja");
		System.out.println(al);
		
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Apple");
		hm.put(2,"Mango");
		hm.put(3,"Banana");
		hm.put(4,"Orange");
		System.out.println(hm);
		
		HashSet<String> set=new HashSet<String>();
		set.add("Vijay");
		set.add("Ravi");
		set.add("Raju");
		set.add("Rahul");
		System.out.println(set);
	}


}
