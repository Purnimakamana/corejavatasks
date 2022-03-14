package IfelseStatement;

public class SwitchDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=4;
		String dayString="";
		switch(day) {
		case 1:dayString="1-Sunday";
		System.out.println(dayString);
		break;
		case 2:dayString="2-Monday";
		System.out.println(dayString);
		break;
		case 3:dayString="3-Tuesday";
		System.out.println(dayString);
		break;
		case 4:dayString="4-Wednesday";
		System.out.println(dayString);
		break;
		case 5:dayString="5-Thursday";
		System.out.println(dayString);
		break;
		case 6:dayString="6-Friday";
		System.out.println(dayString);
		break;
		case 7:dayString="7-Saturdy";
		System.out.println(dayString);
		break;
		default:System.out.println("Invalid day!");
		System.out.println(dayString);
		}

	}

}
