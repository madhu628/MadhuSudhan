package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IncreamentSalary {

	public static void main(String[] args) {
		List<Employee16> employees = Arrays.asList(new Employee16("John", 22, 3000.0),
				new Employee16("Jane", 28, 4000.0), new Employee16("Jack", 26, 5000.0),
				new Employee16("Jill", 23, 3500.0));

		List<Employee16> updatedEmployees = employees.stream().map(emp -> {
			if (emp.getAge() > 25) {
				emp.setSalary(emp.getSalary() * 1.1);
			}
			return emp;
		}).collect(Collectors.toList());

		// updatedEmployees.forEach(System.out::println);
		System.out.println(updatedEmployees);

		System.out.println("**************************");

	}

}
