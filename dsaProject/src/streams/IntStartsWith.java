package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntStartsWith {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(123, 234, 345, 456, 567, 678, 789, 890, 901, 12, 23, 34);

		numbers.stream().map(s -> s + " ").filter(s -> s.startsWith("1")).forEach(System.out::println);
		
		System.out.println("**********************");
		
		int startingDigit = 1;
		List<Integer> filteredNumbers = numbers.stream()
				.filter(num -> String.valueOf(num).startsWith(String.valueOf(startingDigit)))
				.collect(Collectors.toList());

		// Print the filtered numbers
		filteredNumbers.forEach(System.out::println);

	}

}
