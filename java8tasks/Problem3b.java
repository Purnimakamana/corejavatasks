package java8tasks;
//A functional interface can extends another interface only when it does not have any abstract method.
//interface sayable{
//void say(String msg);//abstract method
//}
//@FunctionalInterface
//interface Doable extends sayable{
//Incalid'@FunctionalInterface'annotation;Doable is not a functional interface
//void doIt();
//}
//output:compile-time error.
/* b). Can a functional interface extend/inherit another interface? Explain it and Give an example for both cases.*/
/*//A functional interface is extending to a non-functional interface.*/
interface Doable1{
	default void doIt() {
	System.out.println("Do it now");
	}
}
interface Sayable extends Doable1{
	void say(String msg);//abstract method
}

public class Problem3b implements Sayable {
	public void say(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		Problem3b pb = new Problem3b();
		pb.say("Hello");
		pb.doIt();
		
	}
	

}
