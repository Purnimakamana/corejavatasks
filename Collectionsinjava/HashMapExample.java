package Collectionsinjava;
import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(1,"Vani");
	map.put(2,"Apple");
	map.put(3,"Valli");
	map.put(4,"oange");
	System.out.println("Iterating Haspmap");
	for(Map.Entry m: map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		
	}
}
}
