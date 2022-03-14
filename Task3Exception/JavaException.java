package Task3Exception;

public class JavaException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException(2);
		}
		catch(MyException e) {
			System.out.println(e);
		}

	}

}
class MyException extends Exception{
	int a;
	MyException(int b){
		a=b;
	}
	public String toString() {
		return("Exception Number="+a);
	}
}
