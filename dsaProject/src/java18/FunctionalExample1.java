package java18;

import java.util.Arrays;
import java.util.List;

public class FunctionalExample1 {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("banana", "apple", "kiwi");

		strings.sort(String::length);
		System.out.println(strings); // [kiwi, apple, banana]
	}
}
