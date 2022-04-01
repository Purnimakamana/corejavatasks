package cj11inputoutput;
import java.io.File;
import java.io.IOException;

public class HIddenFileCheck {
	public static void main(String[] args) {
		File file = new File("E:\\Demo.txt");
		if(file.isHidden()) {
			System.out.println("The specified file is hidden");
			
		}
		else {
			System.out.println("The specified file is not hidden");
		}
	}

}
