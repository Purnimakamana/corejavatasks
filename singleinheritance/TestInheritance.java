package singleinheritance;
class Animal{
	void eat() {
		System.out.println("Eating");
	}
	class Dog extends Animal{
		void bark() {
			System.out.println("barking");
		}
	}
}

public class TestInheritance {
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
	}

}
