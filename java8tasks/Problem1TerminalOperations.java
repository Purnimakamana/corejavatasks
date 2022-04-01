package java8tasks;
/*What are the Terminal operations? give an example for 1.collect() 2.reduce() 3. anyMatch() , noneMatch() , allMatch() 4. forEach() 5.forEachOrdered()*/
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem1TerminalOperations {
	public static void main(String[] args) {
		Stream<Integer>streamCollect=Stream.of(1,2,3,4,5);//collect
		List<Integer>intList=streamCollect.collect(Collectors.toList());

		Stream<Integer>streamReduce=Stream.of(1,2,3,4,5);//reduce
		Optional<Integer>sum=streamReduce.reduce((value1, value2)->value1 + value2);
		System.out.println("sum of first 5 numbers using reduce operation:"+sum.get());

		Stream<Integer>streamAnymatch=Stream.of(1,2,3,4,5).parallel();//anymatch
		Predicate<Integer>anymatch=value-> value> 5;
		boolean isAnymatch=streamAnymatch.anyMatch(anymatch);
		System.out.println("anymatch value:"+ isAnymatch);

		Stream<Integer>streamNonematch=Stream.of(1,2,3,4,5).parallel();//none match
		Predicate<Integer>nonematch=value -> value >8;
		boolean isNonematch=streamNonematch.noneMatch(nonematch);
		System.out.println("nonematch method returned value:"+ isNonematch);

		Stream<Integer>streamAllmatch=Stream.of(1,2,3,4,5).parallel();//allmatch
		Predicate<Integer>allmatch=value -> value >3;
		boolean isAllmatch=streamAllmatch.allMatch(allmatch);
		System.out.println("allmatch value:"+ isAllmatch);

		Stream<Integer>streamForEach=Stream.of(1,2,3,4,5).parallel();//ForEach
		List<Integer>numList=new ArrayList<>();
		streamForEach.forEach(value -> numList.add(value));
		System.out.println("numList:"+numList);

		Stream<Integer>streamForEachOrdered=Stream.of(1,2,3,4,5).parallel();//ForEachOrder
		streamForEachOrdered.forEachOrdered(value -> System.out.println(value));
		Stream<Integer>streamForEachOrderedList=Stream.of(1,2,3,4,5).parallel();
		List<Integer>numList1=new ArrayList();
		streamForEachOrderedList.forEachOrdered(value -> numList1.add(value));
		System.out.println("numList1:"+ numList1);
	
		
	}

}
