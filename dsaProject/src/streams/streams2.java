package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streams2 {
	public static void main(String[] args) {
		int[] digits = { 100, 32, 76, 22, 4, 32, 11, 1 };
		IntStream intStream = Arrays.stream(digits);

		Integer[] integerDigits = { 100, 32, 76, 22, 4, 32, 11, 1 };
		Stream<Integer> integerArrayStream = Arrays.stream(integerDigits);

		Stream<Integer> directIntegerStream = Stream.of(100, 32, 76, 22, 4, 32, 11, 1);

		// Converting Integer[] to List<Integer>
		List<Integer> list = Arrays.asList(integerDigits);

		// Converting int[] to List<Integer>
		List<Integer> listVal = Arrays.stream(digits).boxed().toList();

		// Get Biggest value from the IntStream value
		List<Integer> soretedLst = intStream.sorted().boxed().collect(Collectors.toList());
		if (!soretedLst.isEmpty()) {
			System.out.println(soretedLst.get(soretedLst.size() - 1));
		}
		// Approach 2 -// Get Biggest value from the IntStream value
		Iterator itr = soretedLst.listIterator(soretedLst.size() - 1);
		Optional.ofNullable(itr.next()).ifPresent(e -> System.out.println(e));

		System.out.println("*********************");

		// cubes of odd integers
		Integer[] cubeOfDigits = { 1, 2, 3, 4, 5 };

		Arrays.stream(cubeOfDigits).filter(n -> (n % 2 != 0)).map(n -> n * n * n).forEach(n -> System.out.println(n));
		System.out.println("*************");

		// find and print the maximum integer from the list
		List<Integer> integers = Arrays.asList(100, 32, 76, 11, 22, 56, 22, 4, 32, 11, 1);
		integers.stream().sorted((n1, n2) -> n2 - n1).limit(1).forEach(System.out::println);

		// approach 2 find and print the maximum integer from the list
		Optional<Integer> maxInteger = integers.stream().max(Integer::compareTo);

		maxInteger.ifPresent(System.out::println);
		// Result is :100

		System.out.println("***********************");

		// Removing duplicates and printing each distinct element
		Stream<Integer> distinctElementStream = Stream.of(100, 32, 76, 11, 22, 4, 32, 11, 1);
		distinctElementStream.distinct().forEach(n -> System.out.print(n + " "));
		// Result is : 100 32 76 11 22 4 1

		System.out.println("*********************");

		// sort descending limit 3 then sort asecnding limi 1 then print
		Stream<Integer> distinctElementStream1 = Stream.of(100, 32, 76, 11, 22, 4, 32, 11, 1);
		distinctElementStream1.sorted((n1, n2) -> n2 - n1).limit(3).sorted().limit(1).forEach(System.out::println);

		System.out.println("****************");

		Stream<Integer> distinctElementStream2 = Stream.of(100, 32, 76, 11, 22, 4, 32, 11, 1);
		System.out.println(distinctElementStream2.reduce(Integer::min).get());

		System.out.println("****************");

		Stream<Integer> distinctElementStream3 = Stream.of(100, 32, 76, 11, 22, 4, 32, 11, 1);
		System.out.println(distinctElementStream3.reduce((n1, n2) -> Integer.max(n1, n2)).get());

		System.out.println("****************");

		List<Integer> integersList = Arrays.asList(100, 32, null, 76, 11, 22, 56, null, 22, 4, 32, 11, 1);

		// Finding and printing the minimum value
		System.out.println(integersList.stream().filter(n -> n != null).reduce(Integer::min).get());

		// Finding and printing the minimum value, handling Optional safely
		Optional<Integer> minValue = integersList.stream().filter(n -> n != null).reduce(Integer::min);

		minValue.ifPresent(System.out::println);
		
		System.out.println("************************");

		System.out.println("Through parallel stream:"
				+ integersList.parallelStream().filter(n -> n != null).reduce(Integer::min).get());

		// Finding sum of 1 to 5 numbers usng streams
		Integer sumValue = Stream.iterate(1, n -> n <= 5, n -> n + 1).reduce(0, Integer::sum);
		System.out.println("sumValue:" + sumValue);

		// Finding sum of 1 to 5 numbers usng streams
		Integer sumValue2 = Stream.iterate(1, n -> n + 1).limit(5).reduce(0, Integer::sum);
		System.out.println("sumValue2:" + sumValue2);

		Integer sumValue3 = IntStream.rangeClosed(1, 5) // Generates a stream of integers from 1 to 5 inclusive
				.reduce(0, Integer::sum); // Sums the integers

		System.out.println("sumValue: " + sumValue3);
	}

}
