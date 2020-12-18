
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * This is the test class. Nested inside of it is a main method as well as a
 * method that prompts the user and a method that creates new instances for each
 * employee entered in.
 * 
 * @author abrahata May 29
 * @version 1.0
 *
 */

public class Test {

	public static void main(String[] args) {
		ZFullTime fullTime = null;
		boolean scan = true;
		int num = 0;
		ArrayList<ZEmployee> employees = new ArrayList<>();

		Scanner input = new Scanner(System.in);

		while (scan) {
			fixInput();
			while (true)
				try {
					num = Integer.parseInt(input.nextLine());
					if (num > 0 && num <= 6) {
						if (num == 6) {
							for (ZEmployee employee : employees) {
								System.out.println(employee);
								System.out.println(" " + employee.monthlySalary());
								//System.out.println(" " +employee);
							}
						} else {
							employees.add(createInstanceEmployee(num));
						}

					} else if (num == 7) {
						System.out.println("Thank you, bye.");
						return;
					}
					break;
				} catch (NumberFormatException nFormatExceptione) {
					System.out.print("Try again: ");
				}
		}
	}

	private static ZEmployee createInstanceEmployee(int num) {
		Scanner input = new Scanner(System.in);
		ZEmployee fTime = null;
		System.out.println("Enter in first Name:");
		String nameString = input.next();
		System.out.println("Enter in last Name:");
		String lastName = input.next();
		String fullName = nameString + " " + lastName;
		System.out.println("Enter in Birth Month:");
		int birthMonth = input.nextInt();
		if (num == 1) {
			fTime = new ZFullTime(fullName, birthMonth);
		} else if (num == 2) {
			System.out.println("Enter in number of sections: ");
			double numSections1 = input.nextDouble();
			fTime = new ZAdjunct(fullName, birthMonth, numSections1);
		} else if (num == 3) {
			System.out.println("Enter in number of sections: ");
			double numSection1 = input.nextDouble();
			fTime = new ZInstructor(fullName, birthMonth, numSection1);

		} else if (num == 4) {
			fTime = new ZFullTime(fullName, birthMonth);
		} else {
			System.out.println("Enter in number of hours: ");
			double hours = input.nextDouble();
			fTime = new ZTeachAsst(fullName, birthMonth, hours);
		}
		return fTime;
	}

	public static void fixInput() {
		System.out.println("Enter a number accordingly; \n" + "1- Add a full-time professor\n"
				+ "2- Add an adjunct professor\n" + "3- Add an instructor\n" + "4- Add an administrator\n"
				+ "5- Add a graduate teaching assistant\n" + "6- Print payroll\n" + "7- Quit");

	}
}
