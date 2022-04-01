package java8tasks;
//What is functional interface?
//An Interface that contains exactly one abstract method is known as functional interface.It can have any number of 
//default,static methods but can contain only one abstract method.It can also declar methods od object class.
//Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.It is a new 
//feature in Java, which helps to achieve functional programming approach.
/* a).what is functional interface ? Give an example*/
interface runnable{
	void run(String msg);
}

public class Problem3a {
	public void run(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		Problem3a fi=new Problem3a();
		fi.run("Hello");
	}


}
