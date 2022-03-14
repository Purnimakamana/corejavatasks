package abstractclass;
abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("drawing circle");
	}
}

public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Circle();
		s.draw();

	}

}
