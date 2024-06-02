package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaid {

	public static void main(String[] args) {
		List<Employee3> employees = Arrays.asList(new Employee3("Alice", "HR", 75000),
				new Employee3("Bob", "IT", 85000), new Employee3("Carol", "Finance", 95000),
				new Employee3("Dave", "IT", 105000), new Employee3("Eve", "HR", 65000));

		Optional<Employee3> highestPaidEmployee = employees.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee3::getSalary)));
		System.out.println(highestPaidEmployee.get().getName());

//		Optional<Employee3> highestPaidEmployee1 = employees.stream()
//				.max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
//
//		if (highestPaidEmployee1.isPresent()) {
//			System.out.println("Highest paid employee: " + highestPaidEmployee1.get());
//		} else {
//			System.out.println("No employees found.");
//		}
	}

}
