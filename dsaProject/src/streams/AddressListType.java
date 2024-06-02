package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//get all employee having address (is of list type) start with p and having age greater than 22 
public class AddressListType {

	public static void main(String[] args) {

		List<Employee14> employees = Arrays.asList(new Employee14("John", 23, Arrays.asList("Paris", "New York")),
				new Employee14("Jane", 29, Arrays.asList("London", "Berlin")),
				new Employee14("Jack", 25, Arrays.asList("Philadelphia", "San Francisco")),
				new Employee14("Jill", 22, Arrays.asList("Prague", "Boston")),
				new Employee14("Doe", 26, Arrays.asList("Miami", "Los Angeles")),
				new Employee14("James", 24, Arrays.asList("Phoenix", "Seattle")),
				new Employee14("Jen", 27, Arrays.asList("Pittsburgh", "Chicago")));

		List<Employee14> filteredEmployees = employees.stream()
				.filter(e -> e.getAge() > 22 && e.getAddresses().stream().anyMatch(ad -> ad.startsWith("P")))
				.collect(Collectors.toList());

		filteredEmployees.forEach(System.out::println);

		System.out.println("********************");

		employees.stream().filter(e -> e.getAge() > 22 && e.getAddresses().stream().anyMatch(ad -> ad.startsWith("P")))
				.forEach(System.out::println);

	}

}
