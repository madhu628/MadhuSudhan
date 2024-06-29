package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// print employee details based on department 
public class PrintDetailsBasedDept {
	public static void main(String[] args) {
		List<Employee19> employees = Arrays.asList(new Employee19("John", "HR", 3000.0),
				new Employee19("Jane", "Finance", 4000.0), new Employee19("Jack", "HR", 5000.0),
				new Employee19("Jill", "IT", 3500.0), new Employee19("Joe", "Finance", 6000.0),
				new Employee19("Jerry", "IT", 4500.0));

		Map<String, List<Employee19>> employeesByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee19::getDepartment, Collectors.toList()));

		employeesByDept.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " ------" + entry.getValue());

		});

		System.out.println("*****************************");

		// Group employees by department
		Map<String, List<Employee19>> employeesByDept1 = employees.stream()
				.collect(Collectors.groupingBy(Employee19::getDepartment));

		// Print employees based on department
		employeesByDept1.forEach((department, empList) -> {
			System.out.println("Department: " + department);
			empList.forEach(System.out::println);
		});

		System.out.println("************************");

		Map<String, Long> empCountDept = employees.stream()
				.collect(Collectors.groupingBy(Employee19::getDepartment, Collectors.counting()));

		empCountDept.entrySet().forEach(entry -> {
			System.out.println("dept" + entry.getKey() + "-----" + entry.getValue());
		});

	}
}
