package java18;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalExample3 {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "avocado", "grape");

		Predicate<String> startsWithA = s -> s.startsWith("a");
		strings.stream().filter(startsWithA).forEach(System.out::println); // apple avocado
	}

}
