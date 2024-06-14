 package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctDept {
	public static void main(String[] args) {
		List<Employee15> employees = Arrays.asList(new Employee15("John", 23, "Engineering", 50000),
				new Employee15("Jane", 29, "HR", 60000), new Employee15("Jack", 25, "Engineering", 70000),
				new Employee15("Jill", 22, "Marketing", 80000), new Employee15("Doe", 26, "Engineering", 90000),
				new Employee15("James", 24, "Marketing", 75000), new Employee15("Jen", 27, "HR", 65000));

		employees.stream().map(Employee15::getDepartment).distinct().forEach(System.out::println);

		System.out.println("***********************************");

		Set<String> distinctDepartments = employees.stream().map(Employee15::getDepartment).collect(Collectors.toSet());

		// Print the distinct departments
		distinctDepartments.forEach(System.out::println);
		
		System.out.println();
		
		distinctDepartments.forEach(x->System.out.println(x));
		
		System.out.println("***********************************");

		// distinct department with count
		Map<String, Long> distinctDepartments1 = employees.stream()
				.collect(Collectors.groupingBy(Employee15::getDepartment, Collectors.counting()));

		System.out.println(distinctDepartments1);
	}

}
