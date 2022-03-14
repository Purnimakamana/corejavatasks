package methodoverloading;
//changing data type of arguments
class Adder1{
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}
	
}

public class Overloading1 {
	public static void main(String[] args) {
		System.out.println(Adder1.add(12,21));
		System.out.println(Adder1.add(12.3d,12.6d));
	}

}
