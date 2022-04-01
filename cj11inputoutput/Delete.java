package cj11inputoutput;
import java.io.*;

public class Delete {
	public static void main(String[] args) {
		File myFile = new File("E:\\File.txt");
		if(myFile.delete()) {
			System.out.println("File deleted "+myFile.getName()+"successfully.");
		}
		else {
			System.out.println("Failed to delete a file.");
		}
	}

}
