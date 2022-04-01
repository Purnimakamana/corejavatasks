package CollectionsTasks;
import java.util.*;
/*Sort ArrayList in descending order*/

public class Problem4c {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Hai");
		list.add("Hello");
		list.add("Good");
		list.add("Morning");
		list.add("Pravallika");
		System.out.println("Unsorted ArrayList:" + list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Sorted ArrayList" + "in Descendin order: "+ list);
	}

}