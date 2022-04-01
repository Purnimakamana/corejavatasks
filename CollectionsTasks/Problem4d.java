package CollectionsTasks;
import java.util.ListIterator;
import java.util.ArrayList;
/*insert an element to ArrayList using ListIterator*/

public class Problem4d {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		ListIterator listIterator=al.listIterator();
		listIterator.next();
		listIterator.add("Added Element");
		System.out.println("After inserting element,ArrayList contains:");
		for(int intIndex=0; intIndex<al.size(); intIndex++) {
			System.out.println(al.get(intIndex));
		}
		
		
	}

}
