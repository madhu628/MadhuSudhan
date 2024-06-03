package java18;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<String> stringSupplier = () -> "Hello, World!";

		System.out.println(stringSupplier.get()); // Output: Hello, World!
	}
}
