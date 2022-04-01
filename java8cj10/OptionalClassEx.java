package java8cj10;
import java.util.Optional;

public class OptionalClassEx {
	public static void main(String[] args) {
		String[] names=new String[5];
		//System.out.println(names[4].toUpperCase());//ofNullable
		String[] names1 = {"a","b","c","d","e","f"};
		Optional<String> opt = Optional.ofNullable(names[4]);
		if(opt.isPresent()) System.out.println(names[4]);//isPresent
		else System.out.println("Value is null");
		opt.ifPresent(s-> System.out.println(s));//ifPresent
		System.out.println(opt.orElse("default"));//orElse
	}

}
