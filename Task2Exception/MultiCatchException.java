package Task2Exception;

public class MultiCatchException {
	public static void main(String[] args) {
		try {
			int[] a1=new int[5];
			a1[5]=30/0;
		}
		catch(ArithmeticException ae) {
			System.out.println("This is ae");
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("Invalid elements");
		}
		catch(Exception e) {
			System.out.println("Print remaining progaram");
		}
		System.out.println("Normal flow");
	}

}
