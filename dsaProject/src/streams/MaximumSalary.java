
//maximum salary of each department
package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaximumSalary {

	public static void main(String[] args) {
		List<Employee17> employees = Arrays.asList(new Employee17("John", "HR", 3000.0),
				new Employee17("Jane", "Finance", 4000.0), new Employee17("Jack", "HR", 5000.0),
				new Employee17("Jill", "IT", 3500.0), new Employee17("Joe", "Finance", 6000.0),
				new Employee17("Jerry", "IT", 4500.0));

		Map<String, Optional<Employee17>> maxSalariesByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee17::getDepartment,
						Collectors.maxBy((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))));

		maxSalariesByDept.forEach(
				(dept, emp) -> System.out.println("Department: " + dept + ", Max Salary: " + emp.get().getSalary()));

		System.out.println("***********************");

		Map<String, Employee17> maxSalariesByDept1 = employees.stream()
				.collect(Collectors.groupingBy(Employee17::getDepartment, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparingDouble(Employee17::getSalary)), Optional::get)));

		System.out.println(maxSalariesByDept1);
		System.out.println("***********************");

		maxSalariesByDept1
				.forEach((dept, emp) -> System.out.println("Department: " + dept + ", Max Salary: " + emp.getSalary()));

	}

}
