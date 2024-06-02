package streams;

import java.util.List;

public class Employee14 {

	private String name;
	private int age;
	private List<String> addresses;

	public Employee14(String name, int age, List<String> addresses) {
		this.name = name;
		this.age = age;
		this.addresses = addresses;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<String> getAddresses() {
		return addresses;
	}

	@Override
	public String toString() {
		return "Employee{name='" + name + "', age=" + age + ", addresses=" + addresses + "}";
	}

}
