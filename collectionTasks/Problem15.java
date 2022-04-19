package collectionTasks;

import java.util.*;

public class Problem15{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 1; i <= 30; i++) {
			map.put(i, toString(count) + ":00" + " - " + toString(++count) + ":00");
		}
		int count1 = 1;
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();

		for (int i = 1; i <= 30; i++) {
			map1.put(i, toString(count1) + ":00" + ":" + toString(count1) + ":30");
			map1.put(++i, toString(count1) + ":30" + ":" + toString(++count1) + ":00");
		}

		while (true) {
			System.out.println("Welcome to Parking slot..!!");
			System.out.println("Press 0 to enter or 1 to exit..");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("Bye...We will meet soon..!!");
				break;
			}
			System.out.println("Enter your name :");
			String n = sc.next();
			System.out.println("Vehicles have to park are : 1.b1-Bikes, 2.b2-Cars");
			int n1 = sc.nextInt();
			if (n1 == 1) {
				System.out.println("Name of the vehicle is : Bike");
				System.out.println("Available Slots are: ");
				Iterator itr = map.entrySet().iterator();
				while (itr.hasNext())
					System.out.println(itr.next());
				System.out.println("Enter Slot: ");
				int n3 = sc.nextInt();
				if (map.containsKey(n3)) {
					System.out.println("The slot is Booked");
					map.remove(n3);
				} else if (n3 > 30) {
					System.out.println("This slot is not available ");
				} else {
					System.out.println("The slot is already booked..Choose a differet slot and Book gain ");
				}
			}
			if (n1 == 2) {
				System.out.println(" Name of the Vehicle is : Car");
				System.out.println("Available Slots are: ");
				Iterator itr = map1.entrySet().iterator();
				while (itr.hasNext())
					System.out.println(itr.next());

				System.out.println("Enter Slot: ");
				int n4 = sc.nextInt();
				if (map1.containsKey(n4)) {
					System.out.println("The slot is Booked");
					map1.remove(n4);
				} else if (n4 > 30) {
					System.out.println("This slot is not available ");
				} else {
					System.out.println("The slot is already booked..Choose a differet slot and Book gain ");
				}

			}

			System.out.println();
			System.out.println("Want to continue? Press 0 or Press 1 to exit..");
			System.out.println();

		}

	}

	private static String toString(int i) {
		return i + "";
	}

}
