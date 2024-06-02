package streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class CountEmpEachDept {
	public static void main(String[] args) {

		List<Employee5> employees = Arrays.asList(new Employee5("Alice", "HR", 75000, LocalDate.of(2014, 5, 15)),
				new Employee5("Bob", "IT", 85000, LocalDate.of(2016, 3, 10)),
				new Employee5("Carol", "Finance", 95000, LocalDate.of(2018, 7, 19)),
				new Employee5("Dave", "IT", 105000, LocalDate.of(2013, 12, 5)),
				new Employee5("Eve", "HR", 65000, LocalDate.of(2019, 1, 20)));

		Map<String, Long> employeeCountByDepartment = employees.stream()
				.collect(Collectors.groupingBy(Employee5::getDepartment, Collectors.counting()));

		Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		Map<String, Long> employeeCountByDepartment1 = employees.stream()
				.collect(Collectors.groupingBy(Employee5::getDepartment, Collectors.counting()));

		employeeCountByDepartment1.forEach((department, count) -> System.out
				.println("Department: " + department + ", Number of employees: " + count));
	}
}
