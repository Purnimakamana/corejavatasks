package ExceptionHandling;

public class ErrorHandling {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=5;
		try {
			int x=a/(b-c);
		}
		catch(Exception e) {
			System.out.println("Divisible by zero");
		}
		int y=a/(b+c);
		System.out.println("y="+y);
	}

}
