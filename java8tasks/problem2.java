package java8tasks;
/*What are the most commonly used Intermediate operations? give an example for 1.distinct() 2.limit() 3.skip() 4. peek() 5.flatMap()*/
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class problem2 {
	public static void main(String[] args) {
		Stream animalsStream=Stream.of("Cat", "Rabbit", "Dog", "Buffalo", "Monkey");
		Stream distinctStream=animalsStream.distinct();//distinct
		distinctStream.forEach(name ->System.out.println(name));

		Stream.of("one", "Two", "Three", "Four").limit(1).forEach(item -> System.out.println(item));//limit

		Stream.of("One", "Four", "Five", "Eight").skip(2).forEach(item ->System.out.println(item));//skip

		Stream.of("Seven", "Eight", "Nine", "Ten").filter(e -> e.length() >2)//peek
		.peek(e -> System.out.println("Filtered value: "+ e)).map(String::toUpperCase)
		.peek(e -> System.out.println("Mapped value: "+ e)).collect(Collectors.toList());

		// Stream flatStream =stream().flatMap(list -> l.stream());//flatmap
		// long distinctFriuts= flatStream.distinct().count();
		// System.out.println(distinctFriuts);
	}

}
