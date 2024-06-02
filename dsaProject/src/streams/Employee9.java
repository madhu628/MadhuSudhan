package streams;

public class Employee9 {
	private String name;
	private String gender;
	private String department;

	public Employee9(String name, String gender, String department) {
		this.name = name;
		this.gender = gender;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee9 [name=" + name + ", gender=" + gender + ", department=" + department + "]";
	}

}
