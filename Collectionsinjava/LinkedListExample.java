package Collectionsinjava;
import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		list.add("test4");
		System.out.println(list);
		System.out.println(list.get(2));
	}

}
