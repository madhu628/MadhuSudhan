package java18;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Integer> isEven = (n) -> n % 2 == 0;

		System.out.println(isEven.test(4)); // Output: true
		System.out.println(isEven.test(5)); // Output: false
	}
}
