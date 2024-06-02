package streams;

public class Employee10 {
	private String name;
	private String department;

	public Employee10(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return name;
	}
}
