
import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 * 
 * @author abrahata
 * @version 1.0
 * 
 *          ZInstructor class extends the Super class ZEmployee while defining
 *          the previously abstract monthlySalary() method where an Instructor
 *          is paid 10,000 per class taught.
 *
 */

public class ZInstructor extends ZEmployee {

	private double salary;
	private double numSections;
	private double perSection = 10000;
	DecimalFormat df = new DecimalFormat("#.00");

	public ZInstructor(String fullName, int birthMonth, double numSections) {
		super(fullName, birthMonth);
		setNumSections(numSections);
		perSection /= 12;
		perSection = Double.parseDouble(df.format(perSection));
	}

	public double getSalary(double getSalary) {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNumSections(double numSections) {
		return numSections;
	}

	public void setNumSections(double numSections) {
		this.numSections = numSections;
	}

	public double monthlySalary() {
		numSections = getNumSections(numSections);
		LocalDate today = LocalDate.now();
		int currentMonth = today.getMonthValue();
		salary = (numSections * perSection);

		if (currentMonth == getBirthMonth()) {
			salary += 100.00;
		}

		salary = Double.parseDouble(df.format(salary));
		setSalary(salary);
		return salary;
	}

	public String toString() {
		return "ZInstructor [salary=" + monthlySalary() + ", numSections=" + numSections + ", perSection=" + perSection
				+ ", toString()=" + super.toString() + "]";
	}
}
