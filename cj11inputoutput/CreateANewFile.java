package cj11inputoutput;
import java.io.*;

public class CreateANewFile {
	public static void main(String[] args) {
		try {
			File myObj =new File("E:\\Demo.txt");
			
			if(myObj.createNewFile()) {
				 System.out.println("File is created");
			}else {
				System.out.println("File is already exists");
			}
		}
		catch(Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
