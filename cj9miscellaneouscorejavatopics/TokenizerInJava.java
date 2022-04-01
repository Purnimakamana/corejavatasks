package cj9miscellaneouscorejavatopics;
import java.util.StringTokenizer;

public class TokenizerInJava {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("my name is purnima", " ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
	    }
	
	}

}
