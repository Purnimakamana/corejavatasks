package Task1Oops;
import java.util.Scanner;
class Phone{
	static String n;
	static Long num1,num2;
	Phone(String n){
		Phone.n=n;
	}
	void number(Long num1) {
		Phone.num1=num1;
	}
	void number1(Long num2) {
		Phone.num2=num2;
	}
}

public class PersonOne {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person name: ");
		Phone m1=new Phone(sc.next());
		System.out.println("Enter phone number: ");
		m1.number(sc.nextLong());
		System.out.println("Enter more phone numbers: ");
		m1.number1(sc.nextLong());
		System.out.println("person name: "+Phone.n);
		System.out.println("Phone numbers: "+Phone.num1+" "+Phone.num2);
	}

}
