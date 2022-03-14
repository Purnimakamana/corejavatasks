package javaoperators;

public class LogicalORAndBitwiseOR {
	public static void main(String[] args) {
		int a=7;
		int b=5;
		int c=9;
		System.out.println(a>b||a<c);
		System.out.println(a>b|a<c);
		System.out.println(a);
		System.out.println(a>b||a++<c);
		System.out.println(a);
		System.out.println(a>b|a++<c);
		System.out.println(a);
	}

}
