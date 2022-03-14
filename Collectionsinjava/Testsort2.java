package Collectionsinjava;
import java.util.*;
class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	Student(int rollno, String name, int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student st) {
		if(age==st.age) {
			return 0;
		}
		else if(age>st.age) {
			return 1;
		}
		else {
			return -1;
		}
	}
}

public class Testsort2 {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(1,"Vijju",23));
		al.add(new Student(3,"Ajay",27));
		al.add(new Student(2,"Jai",21));
		Collections.sort(al);
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}
