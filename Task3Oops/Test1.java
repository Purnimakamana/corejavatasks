package Task3Oops;
class Shape{
	double pi=3.14,radius;
	float breadth,height;
	int a,b,c;
}
class Circle extends Shape{
	void area(double pi,double radius) {
		System.out.println("The area of the circle:"+pi*radius*radius);
	}
	void perimeter(double pi,double radius) {
		System.out.println("The perimeter of the circle:"+2*pi*radius);
	}
}
class Triangle extends Shape{
	void area(float breadth,float height) {
		System.out.println("The area of the triangle:"+(breadth*height)/2);
	}
	void perimeter(int a,int b, int c) {
		System.out.println("The perimeter of the triangle:"+a+b+c);
	}
}
class Square extends Shape{
	void area(int a) {
		System.out.println("The area of the square:"+a*a);
	}
	void perimeter(int a) {
		System.out.println("The perimeter of the square:"+4*a);
	}
}

public class Test1 {
	public static void main(String[] args) {
		Test1 s=new Test1();
		Circle c=new Circle();
		Triangle t=new Triangle();
		Square sq=new Square();
		c.area(3.14,13.2d);
		c.perimeter(3.14d,11.23d);
		t.area(12.3f,13.5f);
		t.perimeter(3, 4, 5);
		sq.area(5);
		sq.perimeter(6);
	}

}
