package cj9miscellaneouscorejavatopics;
class threadex extends Thread{
	public void run() {
		System.out.println("This is my first thread and it is running");
	}
}

public class StringBuilderExample {
	public static void main(String[] args) {
		threadex t1 = new threadex();
		t1.start();
		
	}

}
