package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitSkip {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> resultNumbers = numbers.stream().skip(3).limit(4).collect(Collectors.toList());

		resultNumbers.forEach(System.out::println);

		System.out.println("*********");

		numbers.stream().skip(3).forEach(x -> System.out.println(x));

		System.out.println("*************");
		numbers.stream().limit(3).forEach(x -> System.out.println(x));
	}

}
