import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 * 
 * @author abrahata
 * @version 1.0
 * 
 *          ZFullTime class extends the super class ZEmployee while defining the
 *          abstract monthlySalary() method where both Full Time Professors and
 *          Administrators is paid 50,000 per year indiscriminately.
 *
 */

//Administration(Secretary) & Full Time professors 

public class ZFullTime extends ZEmployee {

	private double salary = 50000;

	public ZFullTime(String fullName, int birthMonth) {
		super(fullName, birthMonth);
		salary /= 12;

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		}
	}

	public double monthlySalary() {

		LocalDate today = LocalDate.now();
		int currentMonth = today.getMonthValue();
		double finalSalary = salary;
		if (currentMonth == getBirthMonth()) {
			finalSalary = salary + 100;
			DecimalFormat df = new DecimalFormat("#.00");
			finalSalary = Double.parseDouble(df.format(finalSalary));
			return finalSalary;

		} else {
			DecimalFormat df = new DecimalFormat("#.00");
			finalSalary = Double.parseDouble(df.format(finalSalary));
			return finalSalary;
		}
	}

	public String toString() {
		return "ZFullTime Employee [salary=" + monthlySalary() + ", toString()=" + super.toString() + "]";
	}

}
