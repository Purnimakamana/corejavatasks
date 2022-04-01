package MultiThreadingTasks;
/*Exceptions with many catches and its order of execution.examine on specific to general. 
Make sure to include both compile time and runtime exceptions in it.
try followed by catch and finally with return in all blocks. Examine output. 
try followed by catch with return in both blocks. Examine output.*/
class Five1 extends Thread{
	public void run() {
		System.out.println("thread is running");
		try {
			Thread.sleep(1000);
		    int[] a = new int[5];
		    a[5] = 4/0;
		}
		catch(InterruptedException e){
			throw new RuntimeException("Thread interrupted..."+e);
		}
		catch(ArithmeticException ae) {
		    System.out.println("It is arithmetic");
		}
		catch(ArrayIndexOutOfBoundsException aioobe) {
		    System.out.println("it is Arrayindex exception");
		}
		finally {
			System.out.println("execute remaining problem");
		}
		System.out.println("normal flow");

	}
}

class Five2 extends Thread{
	public void run() {
		System.out.println("thread is running");
		try {
			Thread.sleep(2000);
		    int[] a = new int[5];
		    a[5] = 4/0;
		}
		catch(InterruptedException e){
		throw new RuntimeException("Thread interrupted..."+e);
		}
		catch(ArithmeticException ae) {
		System.out.println("It is arithmetic");
		}
		catch(ArrayIndexOutOfBoundsException aioobe) {
		System.out.println("it is Arrayindex exception");
		}
	}
}
public class Problem5{
	public static void main(String[] args) {
		Five1 ttf1 = new Five1();
		Five2 ttf2 = new Five2();
		ttf1.start();
		ttf2.start();
		try {
			ttf1.interrupt();
		    ttf2.interrupt();
		}
		catch(Exception e){System.out.println("Exception handled "+e);}
	}
}
