package staticanddynamicbinding;
class Animal6{
	void eat() {
		System.out.println("animal is eating");
	}
}
class Rabbit extends Animal6{
	void eat() {
		System.out.println("Rabbit is eating");
	}
}

public class DynamicBinding {
	public static void main(String[] args) {
		Animal6 a=new Rabbit();
		a.eat();
	}
	

}
