package Collectionsinjava;
import java.util.*;


public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(2,"Apple");
		map.put(3,"Banana");
		map.put(1,"Mango");
		map.put(4,"Orange");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
