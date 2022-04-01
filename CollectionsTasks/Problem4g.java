package CollectionsTasks;
/*replace an element at specified index ArrayList*/
//You can replace an element of an ArrayList using the set() method of the Collections class.
//This method accepts two parameters an integer parameter indicating the index of the element to be replaced and an element to replace with.
import java.util.ArrayList;

public class Problem4g {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Babu");
		al.add("Bannu");
		al.add("Charan");
		al.add("Raghu");
		System.out.println(al);
		al.set(1,"Rajesh");
		System.out.println(al);
	}


}
