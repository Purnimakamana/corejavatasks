package CollectionsTasks;
import java.util.*;
/*WAP to Convert an Array to ArrayList in Java .Use three ways for conversion and its vice versa.*/

public class Problem2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add("Vani");
		al.add("Valli");
		al.add("Swathi");
		al.add("Teja");
		System.out.println("ArrayList:"+al);
		String[] arr=new String[al.size()];
		al.toArray(arr);
		System.out.println("Array:");
		for(String item:arr) {
			System.out.println(item+" ");
		}
	}


}
