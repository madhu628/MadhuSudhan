package java18;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Arrays;

public class CombinedFunctionalInterfaceExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");

		// Predicate to filter names starting with 'J'
		Predicate<String> startsWithJ = (s) -> s.startsWith("J");

		// Function to convert names to uppercase
		Function<String, String> toUpperCase = (s) -> s.toUpperCase();

		// Combining Predicate and Function using Stream API
		List<String> filteredAndUppercasedNames = names.stream().filter(startsWithJ).map(toUpperCase)
				.collect(Collectors.toList());

		filteredAndUppercasedNames.forEach(System.out::println); // Output: JOHN, JANE, JACK
	}
}
