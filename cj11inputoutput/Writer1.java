package cj11inputoutput;

import java.io.*;
public class Writer1 {
	
	public static void main(String[] args) {
		try {
			File myObj =new File("E:\\Demo.txt");
			FileWriter myWriter = new FileWriter(myObj);
			myWriter.write("This is Purnima");
			myWriter.close();
			System.out.println("Successfully updated");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
