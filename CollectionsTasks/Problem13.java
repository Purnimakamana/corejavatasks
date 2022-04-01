package CollectionsTasks;
import java.util.*;
/*How to synchronize an ArrayList in java*/
public class Problem13 {
	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("Purnima");
		al.add("Vani");
		al.add("Hai");
		al = Collections.synchronizedList(al);
		synchronized(al) {
			Iterator itr =al.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next()+" ");
			}
		}
		
	}

}
