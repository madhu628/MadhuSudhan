package streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MostWorkingExperience {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe", "Jill", "James");

		List<String> filteredNames = names.stream().filter(name -> name.startsWith("J")).map(String::toUpperCase)
				.sorted().collect(Collectors.toList());

		// Print the result
		filteredNames.forEach(System.out::println);
	}

//		List<Employee8> employees = Arrays.asList(new Employee8("Alice", "HR", 75000, LocalDate.of(2014, 5, 15)),
//				new Employee8("Bob", "IT", 85000, LocalDate.of(2016, 3, 10)),
//				new Employee8("Carol", "Finance", 95000, LocalDate.of(2018, 7, 19)),
//				new Employee8("Dave", "IT", 105000, LocalDate.of(2013, 12, 5)),
//				new Employee8("Eve", "HR", 65000, LocalDate.of(2019, 1, 20)));
//		Optional<Employee8> mostWorkingExperience = employees.stream()
//				.sorted(Comparator.comparing(Employee8::getJoinDate)).findFirst();
//
//		Employee8 mosEmployee8 = mostWorkingExperience.get();
//
//		System.out.println(mosEmployee8.getClass());
//		System.out.println(mosEmployee8.getName());

	}


