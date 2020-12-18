
import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 * 
 * @author abrahata
 * @version 1.0
 * 
 *          ZTeachAsst class extends the super class ZEmployee while defining
 *          the abstract monthlySalary() method where an Graduate Teaching
 *          Assistant is paid $9.01 per hour up, but past 80 hours is paid for a
 *          time and a half.
 *
 */

public class ZTeachAsst extends ZEmployee {

	private double salary;
	private double hours;
	private double payRate = 9.01;

	public ZTeachAsst(String fullName, int birthMonth, double hours) {
		super(fullName, birthMonth);
		setHours(hours);
	}

	public double getSalary(double hours) {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getHours(double hours) {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double monthlySalary() {
		hours = getHours(hours);
		LocalDate today = LocalDate.now();
		int currentMonth = today.getMonthValue();
		double overTime = hours - 80;
		if (hours >= 80) {
			salary = ((overTime * 1.5) + 80) * payRate;
		} else {
			salary = (hours * payRate);
		}
		if (currentMonth == getBirthMonth()) {
			salary += 100.00;
		}
		DecimalFormat df = new DecimalFormat("#.00");
		salary = Double.parseDouble(df.format(salary));
		return salary;
	}

	public String toString() {
		return "ZGradTeachAsst [salary=" + monthlySalary() + ", hours= " + hours + ", payRate=" + payRate
				+ ", toString()=" + super.toString() + "]";
	}

}
