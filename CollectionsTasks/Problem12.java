package CollectionsTasks;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection.*;
/* Write a program to serialize an ArrayList in java*/
public class Problem12 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
	    al.add("Hai");
	    al.add("Hello");
	    al.add("Good Morning");
	    System.out.println(al);
	    try {
	    	FileOutputStream fos = new FileOutputStream("MyFile");
	    	ObjectOutputStream oos = new ObjectOutputStream(fos);
	    	oos.writeObject(al);
	    	oos.close();
	    	fos.close();
	    }
	    catch(IOException ioe) {
	    	ioe.printStackTrace();
	    }
	}

}
