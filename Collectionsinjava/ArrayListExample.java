package Collectionsinjava;
import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(5);
		for(int i:list) {
			System.out.println(i);
		}
	}

}
