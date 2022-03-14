package interfaceinjava;
interface printable{
	void print();
}
class Account implements printable{
	public void print() {
		System.out.println("Hello");
	}
}

public class InterfaceJava {
	public static void main(String[] args) {
		Account obj=new Account();
		obj.print();
	}

}
