package collections;

import java.util.Arrays;
import java.util.List;

public class FlatmapAndReduce {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("hello", "world", "java");
		int totalCharacters = strings.stream().map(String::length) // Map each string to its length
				.reduce(0, Integer::sum); // Sum up the lengths
		System.out.println("Total characters (using map): " + totalCharacters);

		List<String> strings1 = Arrays.asList("hello", "world", "java");
		int totalCharacters1 = strings1.stream().flatMapToInt(s -> s.chars()) // FlatMap each string to its characters
				.reduce(0, (total, c) -> total + 1); // Count the characters
		System.out.println("Total characters (using flatMap): " + totalCharacters1);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sumOfSquares = numbers.stream().filter(n -> n % 2 == 0) // Filter even numbers
				.map(n -> n * n) // Square each number
				.reduce(0, Integer::sum); // Sum up the squares
		System.out.println("Sum of squares (using map): " + sumOfSquares);

		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
		int sumOfSquare = number.stream().filter(n -> n % 2 == 0) // Filter even numbers
				.map(n -> n * n) // Square each number
				.reduce(0, Integer::sum); // Sum up the squares
		System.out.println("Sum of squares (using reduce): " + sumOfSquare);

	}

}
