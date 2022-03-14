package Task1Exception;
import java.util.ArrayList;
import java.util.Scanner;
class InvalidEmployeeIDException extends Exception{
	public InvalidEmployeeIDException(String str) {
		super(str);
	}
}

public class CustomException {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		PojosTask1 pj = new PojosTask1("Vani",551,"sangaeddy");
		PojosTask1 pj1 = new PojosTask1("Valli",552,"jogipet");
		PojosTask1 pj2 = new PojosTask1("Swathi",553,"balanagar");
		ArrayList<PojosTask1> list=new ArrayList<PojosTask1>();
		list.add(pj);
		list.add(pj1);
		list.add(pj2);
		System.out.println("Enter your ids:");
		int id = sc.nextInt();
		try {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).id_no==id) {
					System.out.println("Welcome to office");
					return;
				}
			}
			throw new InvalidEmployeeIDException("Invalid ID");
			
		}
		catch(InvalidEmployeeIDException ieie) {
			System.out.println("Caugh the exception");
			System.out.println("Exception Occured"+ieie);
		}
		System.out.println("Print remainging code");

	}

}
