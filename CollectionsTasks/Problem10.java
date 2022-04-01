package CollectionsTasks;
import java.io.*;
import java.util.HashMap;
/*Write a program to serialize a HashMap in java?*/

public class Problem10 {
	public static void main(String[] args) {
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(1,"Purnima");
		hmap.put(22,"Java");
		hmap.put(3,"Vani");
		hmap.put(6,"Valli");
		hmap.put(55,"Apple");
		try {
			FileOutputStream fos=new FileOutputStream("hasmap.file");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(hmap);
			oos.close();
			fos.close();
			System.out.println("Serialized HashMap data is saved in hashmap.file");
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
