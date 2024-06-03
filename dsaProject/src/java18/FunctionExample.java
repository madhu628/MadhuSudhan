package java18;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		Function<String, Integer> lengthFunction = (s) -> s.length();

		System.out.println(lengthFunction.apply("Hello")); // Output: 5
		System.out.println(lengthFunction.apply("Java 8")); // Output: 6
	}
}
