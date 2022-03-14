package staticanddynamicbinding;
class Rabbit1{
	 void run() {
		System.out.println("dog is runing");
	}
}

public class StaticBinding {
	public static void main(String[] args) {
		Rabbit1 r=new Rabbit1();
		r.run();
	}

}
