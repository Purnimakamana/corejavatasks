package superkeyword;
class Anima3{
	String color="white";
}
class Dog3 extends Anima3{
	String color="black";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		Dog3 d=new Dog3();
		d.printColor();
	}

}
