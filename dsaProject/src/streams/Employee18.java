package streams;

public class Employee18 {

	private String name;
	private boolean active;
	private double salary;

	// Constructor
	public Employee18(String name, boolean active, double salary) {
		this.name = name;
		this.active = active;
		this.salary = salary;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{name='" + name + "', active=" + active + ", salary=" + salary + "}";
	}

}
