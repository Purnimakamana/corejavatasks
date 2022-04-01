package MultiThreadingTasks;

public class Problem4 extends Thread {
	public void run() {
		System.out.println("Hello");
		try {
			Thread.sleep(20);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
class Problem41 extends Thread{
	public void run() {
		System.out.println("Hai");
		try {
			Thread.sleep(20);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}