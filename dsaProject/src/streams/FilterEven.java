package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterEven {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 9, 10, 1);

		List<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

		// Print the filtered even numbers
		evenNumbers.forEach(System.out::println);

		System.out.println("****************");

		numbers.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

		System.out.println("****************");

		// findDuplicates
		Set<Integer> hs = new HashSet<Integer>();
		Set<Integer> hs1 = new HashSet<Integer>();
		numbers.stream().filter(n -> !hs.add(n)).forEach(System.out::println);
		
		System.out.println("****************");

		//remove duplicates
		numbers.stream().filter(n -> !hs.add(n)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));

		System.out.println("****************");
		//remove duplicates
		numbers.stream().filter(n -> hs1.add(n)).forEach(System.out::println);

		System.out.println("****************");

		// reverseOreder
		numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

	}

}
