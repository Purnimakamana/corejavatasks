package CollectionsTasks;
import java.util.ArrayList;
/*Remove duplicates from ArrayList without using collections*/

public class Problem4j {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("Java");
		al.add("ab");
		al.add("gsyr");
		al.add("Java");
		al.add("ab");
		al.add(12);
		al.add("Java");
		System.out.println("Before remove Duplicate elements:"+al);
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i).equals(al.get(j))) {
					al.remove(j);
					j--;
				}
			}
		}
		System.out.println("after removing duplicate elements:"+al);
	}


}
