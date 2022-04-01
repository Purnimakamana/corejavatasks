package MultiThreadingTasks;

/* A thread has "add" operation,other thread performs"avg" and other thread performs "display" 
operation which displays avg and add details after the two threads are compeletely performed.*/
class Adding extends Thread{
	static int z;
	public void run() {
		int x=20;
		int y=10;
		z=x+y;
	}
}
class Average extends Thread{
	static float r;
	public void run() {
		float p=21.2f;
		float q=3.2f;
		r=(p+q)/2;
	}
}
class Display extends Thread{
	public void run() {
		System.out.println("Adding two numbers : " + Adding.z);
		System.out.println("Average of two numbers : " + Average.r);
	}
}

public class Problem2 {
	public static void main(String[] args) {
		Adding ad =new  Adding();
		Average avg = new Average();
		Display dis = new Display();
		ad.start();
		avg.start();
		dis.start();
	}

}
