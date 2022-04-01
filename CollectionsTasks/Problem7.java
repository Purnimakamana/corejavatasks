package CollectionsTasks;

import java.util.*;
/*Write a program to reverse ArrayList in java?*/
public class Problem7 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Dog");
		al.add("Cat");
		al.add("Rabbit");
		al.add("Tiger");
		System.out.println("Before reverse Arraylist:");
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println("After reverse ArrayList:");
		System.out.println(al);
	}


}
