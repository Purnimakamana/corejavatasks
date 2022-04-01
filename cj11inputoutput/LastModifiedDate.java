package cj11inputoutput;
import java.io.File;
import java.text.SimpleDateFormat;

public class LastModifiedDate {
	public static void main(String[] args) {
		File file = new File("E:\\Demo.txt");
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd//yyyy HH:mm:ss");
		System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
	}

}
