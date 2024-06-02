package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NameAllDepts {

	public static void main(String[] args) {
		List<Employee1> employees = Arrays.asList(new Employee1("Alice", "HR"), new Employee1("Bob", "IT"),
				new Employee1("Carol", "Finance"), new Employee1("Dave", "IT"), new Employee1("Eve", "HR"));

		employees.stream().map(Employee1::getDepartment).distinct().forEach(System.out::println);
		
		 Set<String> departments = employees.stream()
		            .map(Employee1::getDepartment) // Extract the department of each employee
		            .collect(Collectors.toSet()); // Collect the results into a Set to ensure uniqueness

		        System.out.println("Departments in the organization: " + departments);
	}

}
