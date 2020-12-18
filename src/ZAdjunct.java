import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 * 
 * @author abrahata
 * @version 1.0
 * 
 *          ZAdjunct class extends the super class ZEmployee while defining the
 *          abstract monthlySalary() method where an Adjunct professor is paid a
 *          base of 30,000 plus 5,000 per class taught.
 *
 */

public class ZAdjunct extends ZEmployee {

	private double numSections;
	private double standardSalary = 30000;
	private double perSection = 5000;
	private static double salary;

	public ZAdjunct(String fullName, int birthMonth, double numSection) {
		super(fullName, birthMonth);
		setNumSections(numSection);
		salary /= 12;
	}

	public double getSalary(double salary) {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static double getNumSections(double numSections) {
		return numSections;
	}

	public void setNumSections(double numSections) {
		this.numSections = numSections;
	}

	public double monthlySalary() {
		LocalDate today = LocalDate.now();
		int currentMonth = today.getMonthValue();
		salary = (standardSalary + (numSections * perSection) / 12);
		if (currentMonth == getBirthMonth()) {
			salary += 100;
		} else {
			salary = standardSalary + (numSections * perSection);

		}

		DecimalFormat df = new DecimalFormat("#.00");
		salary = Double.parseDouble(df.format(salary));

		return salary;
	}

	public String toString() {
		return "ZAdjunct [numSections=" + numSections + ", standardSalary=" + standardSalary + ", perSection="
				+ perSection + ", salary=" + monthlySalary() + ", toString()=" + super.toString() + "]";
	}

}
