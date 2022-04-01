package cj11inputoutput;
import java.io.*;

public class Append {
	public static void main(String[] args) {
		String data = "This data is appended...";
		try {
			FileWriter myObj = new FileWriter("E:\\Demo.txt",true);
			myObj.write(data);
			System.out.println("Data appended successfully.");
			myObj.close();
		} catch (IOException e) {
			System.out.println("File append error...");
			e.printStackTrace();
		}
	}

}
