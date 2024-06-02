package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OldestEmployee {

	public static void main(String[] args) {
		List<Employee13> employees = Arrays.asList(new Employee13("John", 23, "Engineering", 50000),
				new Employee13("Jane", 29, "HR", 60000), new Employee13("Jack", 25, "Engineering", 70000),
				new Employee13("Jill", 22, "Marketing", 80000), new Employee13("Doe", 26, "Engineering", 90000),
				new Employee13("James", 24, "Marketing", 75000), new Employee13("Jen", 27, "HR", 65000));

		Optional<Employee13> oldestEmployee = employees.stream()
				.max((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));

		if (oldestEmployee.isPresent()) {
			Employee13 emp = oldestEmployee.get();
			System.out.println("Oldest Employee:");
			System.out.println("Name: " + emp.getName());
			System.out.println("Age: " + emp.getAge());
			System.out.println("Department: " + emp.getDepartment());
		} else {
			System.out.println("No employees found.");
		}
		Optional<Employee13> oldestEmployee1 = employees.stream().max(Comparator.comparingInt(Employee13::getAge));

		Employee13 olEmployee13 = oldestEmployee1.get();
		System.out.println(olEmployee13.getName());
		System.out.println(olEmployee13.getAge());
		System.out.println(olEmployee13.getDepartment());

	}

}
