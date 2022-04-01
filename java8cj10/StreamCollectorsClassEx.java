package java8cj10;

import java.util.ArrayList;
import java.util.List;

class Employee2{
	int empId;
	String empname;
	double salary;
	public Employee2(int empId, String empname, double salary) {
		this.empId=empId;
		this.empname=empname;
		this.salary=salary;
	}
}

public class StreamCollectorsClassEx {
public static void main(String[] args) {
		
		Employee2 e1=new Employee2(1,"Vani",90000.00);
		Employee2 e2=new Employee2(2,"Valli",80000.00);
		Employee2 e3=new Employee2(3,"Teja",70000.00);
		Employee2 e4=new Employee2(4,"Swathi",50000.00);
		List<Employee2>employeeList=new ArrayList<Employee2>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		System.out.println("empId" + " " + "empname");
		employeeList.stream().filter(emp->emp.salary==50000.00)
		.forEach(emp->System.out.println(e1.empId+" "+e1.empname));
	}

}
