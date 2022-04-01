package java8cj10;
import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpressionEx {
	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(6);
		num.add(5);
		num.add(3);
		num.add(9);
		//num.forEach((n)->{System.out.println(n);});//forEach
		Consumer<Integer>method=(n)->{System.out.println(n);};//Consumer
		num.forEach(method);
	}

}
