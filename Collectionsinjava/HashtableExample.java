package Collectionsinjava;
import java.util.*;

public class HashtableExample {
	public static void main(String[] args) {
		Hashtable<Integer,String>hm=new Hashtable<Integer,String>();
		hm.put(1, "Anu");
		hm.put(3,"Geetha");
		hm.put(2,"Varun");
		hm.put(0,"Vani");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
