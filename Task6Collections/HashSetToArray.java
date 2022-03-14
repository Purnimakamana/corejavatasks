package Task6Collections;
import java.io.*;
import java.util.*;

public class HashSetToArray {
	public static void main(String[] args) {
		HashSet<String>set=new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		System.out.println("HeshSet contains:"+set);
		String arr[]=new String[set.size()];
		set.toArray(arr);
		for(String i:arr) {
			System.out.println(i);
		}
	
	}

}
