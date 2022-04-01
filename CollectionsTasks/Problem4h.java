package CollectionsTasks;
/*4h)Search an element of Java ArrayList*/
//An element in an ArrayList can be searched using the method java.util.Arraylist.indexOf().
//This method returns the index of the first occurance of the element that is specified.
//The element is not available in the ArrayList then this method returns -1.
import java.util.ArrayList;
import java.util.List;

public class Problem4h {
	public static void main(String[] args) {
		List alist=new ArrayList();
		alist.add("Apple");
		alist.add("Mango");
		alist.add("Orange");
		alist.add("Banana");
		alist.add("Grapes");
		int index1 = alist.indexOf("Orange");
		int index2 = alist.indexOf("Papaya");
		if(index1 == -1) {
			System.out.println("The fruit Orange is not in the ArrayList");
		}
		else {
			System.out.println("The fruit Orange is in the ArrayList");
		}
		if(index2 == -1) {
			System.out.println("The fruit Papaya is not in the ArrayList");
		}
		else {
			System.out.println("The fruit Papaya is in the ArrayList");
		}
	}

}
