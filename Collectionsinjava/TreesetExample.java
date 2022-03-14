package Collectionsinjava;
import java.util.*;

public class TreesetExample {
	public static void main(String[] args) {
		TreeSet<String>set=new TreeSet<String>();
		set.add("Vani");
		set.add("Puja");
		set.add("Vani");
		set.add("Anu");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
