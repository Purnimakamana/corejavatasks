package Task5Oops;

public class Box {
	double l,b,h;
	Box(double l,double b,double h){
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public void area() {
		double area =2*((l*b)+(b*h)+(h*l));
		System.out.println("Area of the box:" +area);
	}
	public void volume() {
		double volume =l*b*h;
		System.out.println("Volume of the box:"+volume);
	}

}
