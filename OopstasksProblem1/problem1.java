package OopstasksProblem1;
import java.util.Scanner;
class Mobile{
	void name() {
		System.out.println("8331864562");
	}
}
class Mobile2 extends Mobile{
	void name() {
		super.name();
		System.out.println("7013722529");
		
	}
}
public class problem1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the person name : ");
		String s=sc.nextLine();
		Mobile2 m=new Mobile2();
		m.name();
	}

}
