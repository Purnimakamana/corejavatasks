package methodoverriding;
class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}
class Bike extends Vehicle{
	void run() {
		System.out.println("Bike is running safely");
	}
}

public class Overriding {
	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.run();
	}

}
