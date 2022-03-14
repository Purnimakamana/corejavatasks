package methodoverloading;
//changing no.ofarguments
class Adder{
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b, int c) {
		return a+b+c;
	}
}

public class Overloading {
	public static void main(String[] args) {
		System.out.println(Adder.add(11,23));
		System.out.println(Adder.add(12,23,34));
	}

}
