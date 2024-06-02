package java8;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int age;
	private long salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getSalary() {
		return salary;
	}

	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		return (this.id - emp.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name) && salary == other.salary;
	}

	public static final Comparator<Employee> SalaryComparator = (e1, e2) -> (int) (e1.getSalary() - e2.getSalary());

	public static final Comparator<Employee> AgeComparator = (e1, e2) -> e1.getAge() - e2.getAge();

	public static final Comparator<Employee> NameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
}
