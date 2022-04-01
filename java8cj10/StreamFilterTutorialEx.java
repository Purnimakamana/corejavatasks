package java8cj10;
import java.util.*;
import java.util.stream.Collectors;
class Employee{
	int id;
	String name;
	float salary;
	public Employee(int id, String namr, float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

public class StreamFilterTutorialEx {
	public static void main(String[] args) {
		List<Employee>elist=new ArrayList<Employee>();
		elist.add(new Employee(1,"Vani",25000f));
		elist.add(new Employee(2,"Valli",30000f));
		elist.add(new Employee(3,"Teja",35000f));
		elist.add(new Employee(4,"Swathi",45000f));
		elist.add(new Employee(5,"Anusha",55000f));
		//elist.stream()
		//.filter(e->e.salary>30000)//filtering salary
		//.map(em->em.salary)//fetching salary
		//.forEach(System.out::println);//iterating salary
		List<Float>salaryList=elist.stream()
				.filter(e->e.salary>35000)//filtering salary
				.map(em->em.salary)//fetching salary
				.collect(Collectors.toList());  
		System.out.println(salaryList);
	}


}
