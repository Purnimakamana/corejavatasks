package cj11inputoutput;
import java.io.*;
import java.util.Scanner;
public class Reader {
	public static void main(String[] args) {
		try {
			File myObj = new File("E:\\Demo.txt");
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
