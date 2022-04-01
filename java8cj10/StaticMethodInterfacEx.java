package java8cj10;
interface MyInterface1{
	default void newMethod() {
		System.out.println("Newly added default method");
	}
	static void anotherNewMethod() {
		System.out.println("Newly added default method");
	}
	void existingMethod(String str);
}

public class StaticMethodInterfacEx implements MyInterface1 {
	public void existingMethod(String str) {
		System.out.println("String is:"+str);
	}
	public static void main(String[] args) {
		StaticMethodInterfacEx obj = new StaticMethodInterfacEx();
		obj.newMethod();
		MyInterface1.anotherNewMethod();
		obj.existingMethod("Java8 is easy to learn");
	}

}
