package abstractclass;
abstract class Bike{
	abstract void run();
}
class Honda extends Bike{
	void run() {
		System.out.println("runing safely");
	}
}

public class AbstractMethod {
	public static void main(String[] args) {
		Bike obj=new Honda();
		obj.run();
	}

}
