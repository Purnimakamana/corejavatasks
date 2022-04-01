package MultiThreadingTasks;
/*Create a multithreaded program by creating a subclass of Thread and then creating, initializing, and staring two Thread objects from your class. The threads will execute concurrently and display Java is hot,aromatic, and invigorating to the console window.
 */
class Thread1 extends Thread{
	public void run() {
		System.out.println("Java is hot,aromatic and invigorating");
		}
}
class Thread2 extends Thread{
	public void run() {
		System.out.println("Java is hot,aromatic and invigorating");
		
	}
}


public class Problem1 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}


}

