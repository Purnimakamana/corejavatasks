package CollectionsTasks;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
/* Write a program to synchronize a HashMap in java*/

public class Problem11 {
	public static void main(String[] args) {
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(4,"Puja");
		hmap.put(31,"Valli");
		hmap.put(9,"Anjali");
		hmap.put(77,"Sanjana");
		hmap.put(8,"Abc");
		Map map=Collections.synchronizedMap(hmap);
		Set set=map.entrySet();
		synchronized(map) {
			Iterator i=set.iterator();
			//Display elements
			while(i.hasNext()) {
				Map.Entry me=(Map.Entry)i.next();
				System.out.println(me.getKey() + " : " + me.getValue());
				
			}
		}
	}


}
