package regex;
import java.util.regex.*;

public class RegexExample {
	public static void main(String[] args) {
		System.out.println(Pattern.matches(".r","gr"));//true(2nd char is r)
		System.out.println(Pattern.matches(".r","rm"));//false(2nd char is not r)
		System.out.println(Pattern.matches(".r","mstr"));//false(has more than 2 char)
		System.out.println(Pattern.matches(".r","ramms"));//false(has more than 2 char)
		System.out.println(Pattern.matches("..r","mar"));//true(3rd char is r)
	}
	
	

}
