package java8cj10;
interface MyInterface{
	default void newMethod() {
		System.out.println("Newly added default method");
	}
	void existingMethod(String str);
}

public class DefaultMethodinInterface implements MyInterface {
	public void existingMethod(String str) {
		System.out.println("string is:"+str);
	}
	public static void main(String[] args) {
		DefaultMethodinInterface obj = new DefaultMethodinInterface();
		obj.newMethod();
		obj.existingMethod("Java8 is easy to learn");
	}
	

}
