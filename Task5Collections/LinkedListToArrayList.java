package Task5Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("Orange");
		l.add("Apple");
		l.add("Kiwi");
		l.add("Banana");
		l.add("Guava");
		List<String>aList=new ArrayList<String>(l);
		System.out.println("The arraylist elements are:");
		for(String i:aList) {
			System.out.println(i);
		}
	}

}
