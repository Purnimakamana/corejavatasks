package CollectionsTasks;
import java.util.ArrayList;
/*4i)Remove element from specified index ArrayList*/
//Method remove(int index)is used for removing an element and returns the same.
//It throws IndexOutOfBoundsException if the specified index is less than zero or greater than the size of the list(index size of ArrayList)

public class Problem4i {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Purnima");
		al.add("Valli");
		al.add("Teja");
		al.add("Bhavya");
		al.add("Swathi");
		al.add("Ananya");
		System.out.println("ArrayList before remove : ");
		for(String var:al) {
			System.out.println(var);
		}
		//removing 1st element
		al.remove(0);
		//removing 3rd element
		al.remove(3);
		System.out.println("ArrayLIst after remove : ");
		for(String var2:al) {
			System.out.println(var2);
		}
	}


}
