package Collectionsinjava;
import java.util.*;
import java.util.Map.Entry;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
		hm.put(13,"Rajesh");
		hm.put(2,"Naveen");
		hm.put(3,"Arun");
		for(Entry<Integer, String> m:hm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}

}
}