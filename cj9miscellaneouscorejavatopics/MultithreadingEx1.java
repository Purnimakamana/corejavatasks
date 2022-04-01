package cj9miscellaneouscorejavatopics;
class example implements Runnable{
	public void run() {
		System.out.println("First thread is running");
	}
}

public class MultithreadingEx1 {
	public static void main(String[] args) {
		example e=new example();
		Thread t1= new Thread(e);
		t1.start();
	}


}
