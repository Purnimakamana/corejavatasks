package CollectionsTasks;
import java.util.*;
/*Write a program to iterate TreeMap in java?*/

public class Problem8 {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(11,"Valli");
		tm.put(12,"Vani");
		tm.put(13,"Teja");
		tm.put(4,"Swathi");
		for(Map.Entry m:tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
