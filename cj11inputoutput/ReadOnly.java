package cj11inputoutput;
import java.io.File;
import java.io.IOException;

public class ReadOnly {
	public static void main(String[] args) {
		File myfile = new File("E:\\Demo.txt");
		boolean flag = myfile.setReadOnly();
		if(flag==true) {
			System.out.println("File successfully converted to Read only mode....");
		}
		else {
			System.out.println("Unsuccessful Operation...");
		}
	}

}
