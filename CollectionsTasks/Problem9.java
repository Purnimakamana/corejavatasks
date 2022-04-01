package CollectionsTasks;
import java.util.*;
import java.util.Map.Entry;
/*Write a program to sort HashMap by value*/

public class Problem9 {
	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Mango",1);
		hm.put("Banana",2);
		hm.put("Orange",3);
		hm.put("Apple",0);
		Integer value=2;
		for(Entry<String, Integer> entry:hm.entrySet()) {
			if(entry.getValue()==value) {
				System.out.println("The key for value " + value + " is " + entry.getKey());
				break;
			}
		}
	}

}
