package java8cj10;
interface runnable{
	void run(String msg);
}

public class FunctionalInterface implements runnable{
	public void run(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		FunctionalInterface fi=new FunctionalInterface();
		fi.run("Hello");
	}

}
