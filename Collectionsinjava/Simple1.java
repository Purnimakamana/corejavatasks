package Collectionsinjava;

import java.util.*;
class Student1{
	int rollno;
	String name;
	int age;
	Student1(int rollno, String name, int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
 class Comparator1 implements Comparator<Student1>{
	public int compare(Student1 s1, Student s2) {
		if(s1.age==s2.age)
			return 0;
		else if (s1.age>s2.age)
			return 1;
		else 
			return -1;
	}

	@Override
	public int compare(Student1 o1, Student1 o2) {
		return 0;
	}
}
class NameComparator implements Comparator<Student1>{
	public int compare(Student1 s1,Student1 s2) {
		return s1.name.compareTo(s2.name);
	}
}
public class Simple1 {
	public static void main(String[] args) {
		ArrayList<Student1> al=new ArrayList<Student1>();
		al.add(new Student1(12,"Anu",23));
		al.add(new Student1(13,"Priya",25));
		al.add(new Student1(14,"Amulya",27));
		System.out.println("Sorting by name");
		Collections.sort(al,new NameComparator());
		for(Student1 st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		System.out.println("Sorting by age");
		Collections.sort(al,new Comparator1());
		for(Student1 st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
	}

}
