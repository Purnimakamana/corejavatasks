package cj9miscellaneouscorejavatopics;
class threadex1 extends Thread{
	public void run() {
		System.out.println("This is my first thread it is running");
	}
}
public class MultithreadingExample {
	public static void main(String[] args) {
		threadex1 t1 = new threadex1();
		t1.start();
	}

}
