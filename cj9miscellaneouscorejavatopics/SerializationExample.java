package cj9miscellaneouscorejavatopics;
import java.io.Serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Employee implements Serializable{
	String name;
	int num;
	Employee(String name, int num){
		this.name=name;
		this.num=num;
	}
}

public class SerializationExample {
	public static void main(String[] args) {
		Employee e1 = new Employee("Purnima",522);
		try {
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(e1);
			out.flush();
			fout.close();
			System.out.println("Success");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}