package java8cj10;
import java.util.ArrayList;
import java.util.List; 

public class StreamTutorialEx {
	public static void main(String[] args) {    
		List<String> names = new ArrayList<String>();
		names.add("Anu");
		names.add("Nagu");
		names.add("Annanya");
		names.add("SWathi");
		names.add("Vani");
		int count = 0;
		for (String str : names) {
		   if (str.length() < 6) 
			count++; 
	    }
	        System.out.println("There are "+count+" strings with length less than 6");
	} 

}
