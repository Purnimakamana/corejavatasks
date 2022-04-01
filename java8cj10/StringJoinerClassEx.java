package java8cj10;
import java.util.StringJoiner;
public class StringJoinerClassEx {
	 public static void main(String[] args) {  
	        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter   
	          
	        // Adding values to StringJoiner  
	        joinNames.add("Vani");  
	        joinNames.add("Valli");  
	        joinNames.add("Rama");  
	        joinNames.add("Teja");  
	                  
	        System.out.println(joinNames);  
	    } 

}
