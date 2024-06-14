package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class EmpoyeesEachDept {

	public static void main(String[] args) {
		List<Employee10> employees = Arrays.asList(new Employee10("John", "Engineering"), new Employee10("Jane", "HR"),
				new Employee10("Jack", "Engineering"), new Employee10("Jill", "Marketing"),
				new Employee10("Doe", "Engineering"), new Employee10("James", "Marketing"),
				new Employee10("Jen", "HR"));

		Map<String, List<Employee10>> employeesByDepartment = employees.stream()
				.collect(Collectors.groupingBy(Employee10::getDepartment));
		
		System.out.println(employeesByDepartment);

		Set<Entry<String, List<Employee10>>> entrySet = employeesByDepartment.entrySet();

		for (Entry<String, List<Employee10>> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		Map<String, List<String>> employeesByDepartment1 = employees.stream().collect(Collectors
				.groupingBy(Employee10::getDepartment, Collectors.mapping(Employee10::getName, Collectors.toList())));

		// Print the names of employees in each department
		employeesByDepartment1.forEach((department, employeeNames) -> {
			System.out.println("Department: " + department);
			employeeNames.forEach(name -> System.out.println(" - " + name));
		});

//		Map<String, List<Employee10>> employeesByDepartment2 = employees.stream()
//				.collect(Collectors.groupingBy(Employee10::getDepartment)).entrySet().stream()
//				.collect(Collectors.toMap(a -> a.getKey(), a -> a.getValue())).stream()
//				.map(m -> m.getName().collect(Collectors.toList()));
	}

}
