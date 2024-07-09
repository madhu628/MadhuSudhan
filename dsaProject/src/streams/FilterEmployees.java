package streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployees {
	public static void main(String[] args) {
		List<Employee4> employees = Arrays.asList(new Employee4("Alice", "HR", 75000, LocalDate.of(2014, 5, 15)),
				new Employee4("Bob", "IT", 85000, LocalDate.of(2016, 3, 10)),
				new Employee4("Carol", "Finance", 95000, LocalDate.of(2018, 7, 19)),
				new Employee4("Dave", "IT", 105000, LocalDate.of(2013, 12, 5)),
				new Employee4("Eve", "HR", 65000, LocalDate.of(2019, 1, 20)));

		 //employees.stream().filter(e -> e.getJoinDate() > isAfter(LocalDate.of(2015, 12, 31)).forEach(System.out::println));

		List<String> employeeNames = employees.stream().filter(e -> e.getJoinDate().isAfter(LocalDate.of(2015, 12, 31)))
				.map(Employee4::getName).collect(Collectors.toList());

		System.out.println("Employees who joined after 2015: " + employeeNames);
	}

}
