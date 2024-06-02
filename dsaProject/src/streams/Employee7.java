package streams;

public class Employee7 {

	private String name;
	private String department;
	private int age;
	private String gender;

	public Employee7(String name, String department, int age, String gender) {
		this.name = name;
		this.department = department;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Employee{name='" + name + "', department='" + department + "', age=" + age + ", gender='" + gender
				+ "'}";
	}

}
