package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ActiveInactive {

	public static void main(String[] args) {
		List<Employee18> employees = Arrays.asList(new Employee18("John", true, 3000.0),
				new Employee18("Jane", false, 4000.0), new Employee18("Jack", true, 5000.0),
				new Employee18("Jill", false, 3500.0), new Employee18("Joe", true, 6000.0),
				new Employee18("Jerry", false, 4500.0));

		// Partition employees into active and inactive
		Map<Boolean, List<Employee18>> partitionedEmployees = employees.stream()
				.collect(Collectors.partitioningBy(Employee18::isActive));

		// Active employees
		List<Employee18> activeEmployees = partitionedEmployees.get(true);
		System.out.println("Active Employees:");
		activeEmployees.forEach(System.out::println);

		// Inactive employees
		List<Employee18> inactiveEmployees = partitionedEmployees.get(false);
		System.out.println("Inactive Employees:");
		inactiveEmployees.forEach(System.out::println);
	}

}
