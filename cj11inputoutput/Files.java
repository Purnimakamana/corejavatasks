package cj11inputoutput;
import java.io.*;

public class Files {
	public static void main(String[] args) {
		File myObj = new File("E:\\Demo.txt");
		if(myObj.exists()) {
			System.out.println(myObj.getName());
			System.out.println(myObj.getAbsolutePath());
			System.out.println(myObj.length());
			System.out.println(myObj.canRead());
			System.out.println(myObj.canWrite());
		}
		else {
			System.out.println("File dosenot exists");
		}
	}

}
