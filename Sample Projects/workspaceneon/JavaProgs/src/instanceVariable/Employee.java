package instanceVariable;

// Employee modal class
public class Employee {

	// this instance variable is visible for any child class.
	public String name;

	// salary variable is visible in Employee class only.
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}