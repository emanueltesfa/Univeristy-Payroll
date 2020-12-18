
/**
 * 
 * @author abrahata
 * @version 1.0
 * 
 *          This is the super class that holds getters and setters for Full Name
 *          and Birth Month but also holds the single abstract class that will
 *          be used in all subclasses.
 *
 */

public abstract class ZEmployee {
	private String fullName = "";
	private int birthMonth;

	public ZEmployee(String fullName, int birthMonth) {
		this.fullName = fullName;
		this.birthMonth = birthMonth;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String toString() {
		return "ZEmployee [Full Name=" + fullName + ", Birth Month=" + birthMonth + "]";
	}

	public abstract double monthlySalary();
}
