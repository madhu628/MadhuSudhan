package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmployees2 {

	public static void main(String[] args) {
		List<Employee9> employees = Arrays.asList(new Employee9("John", "Male", "Marketing"),
				new Employee9("Jack", "Male", "Sales"), new Employee9("Jill", "Female", "Sales"),
				new Employee9("Doe", "Male", "Marketing"), new Employee9("James", "Male", "Sales"));

//		Map<String, Long> employeesByGender = employees.stream().filter(e -> e.getDepartment() == "Sales")
//				.collect(Collectors.groupingBy(Employee9::getGender, Collectors.counting()));
//
//		System.out.println(employeesByGender);

		Map<String, List<Employee9>> employeesByGender1 = employees.stream()
				.collect(Collectors.groupingBy(Employee9::getGender));
		
		
		System.out.println(employeesByGender1);

		System.out.println("Male Employees:");
		employeesByGender1.getOrDefault("Male", Arrays.asList()).forEach(System.out::println);

		System.out.println("\nFemale Employees:");
		employeesByGender1.getOrDefault("Female", Arrays.asList()).forEach(System.out::println);

	}

}
