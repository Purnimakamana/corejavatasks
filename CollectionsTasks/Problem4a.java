package CollectionsTasks;
import java.util.*;
/*How to Iterate ArrayList using Java ListIterator*/

public class Problem4a {
	public static void main(String[] args) {
		try {
			ArrayList<String>al=new ArrayList<String>();
			al.add("P");
			al.add("R");
			al.add("V");
			al.add("Q");
			System.out.println("ArrayList: " + al);
			ListIterator<String>
			iterator = al.listIterator(1);
			System.out.println("Using ListIterator" + "from Index 1:");
			while(iterator.hasNext()) {
				System.out.println("Value is:"+iterator.next());
			}
		}
		catch(IndexOutOfBoundsException  e) {
			System.out.println("Exception thrown: " + e);
		}
	}


}
