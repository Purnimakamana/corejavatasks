package MultiThreadingTasks;
import java.io.IOException;

public class Problem4a {
	public static void main(String[] args) {
		try {
		Problem4 myfile=new Problem4();
		Problem41 myfile1=new Problem41();
		myfile.setName("Purnima");
		System.out.println(myfile.getName());
		myfile.setPriority(5);
		System.out.println(myfile1.getName());
		myfile1.setPriority(3);
		System.out.println(myfile1.getPriority());
		myfile.join();
		myfile1.join();
		System.out.println(myfile.isAlive());
		System.out.println(myfile1.isAlive());
		System.out.println(myfile.getName());
		System.out.println(myfile1.getName());
		}
		catch(Exception ioe) {
			ioe.printStackTrace();
		}
	}

}
