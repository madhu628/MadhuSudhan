package java18;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		// Creating an Optional with a non-null value
		Optional<String> nonEmptyOptional = Optional.of("Hello, World!");
		System.out.println("Non-Empty Optional: " + nonEmptyOptional.get()); // Output: Hello, World!

		// Creating an Optional that can hold a nullable value
		Optional<String> nullableOptional = Optional.ofNullable(null);
		System.out.println("Nullable Optional: " + nullableOptional); // Output: Optional.empty

		// Creating an empty Optional
		Optional<String> emptyOptional = Optional.empty();
		System.out.println("Empty Optional: " + emptyOptional); // Output: Optional.empty

		// Checking if a value is present
		if (nonEmptyOptional.isPresent()) {
			System.out.println("Non-Empty Optional is present."); // Output: Non-Empty Optional is present.
		}

		// Using ifPresent to execute a block of code if a value is present
		nonEmptyOptional.ifPresent(value -> System.out.println("Value: " + value)); // Output: Value: Hello, World!

		// Using orElse to provide a default value
		String defaultValue = nullableOptional.orElse("Default Value");
		System.out.println("Default Value: " + defaultValue); // Output: Default Value: Default Value

		// Using orElseGet to provide a default value using a supplier
		String defaultValueFromSupplier = nullableOptional.orElseGet(() -> "Default from Supplier");
		System.out.println("Default Value from Supplier: " + defaultValueFromSupplier); // Output: Default Value from
																						// Supplier: Default from
																						// Supplier

		// Using orElseThrow to throw an exception if the value is not present
		try {
			nullableOptional.orElseThrow(() -> new IllegalArgumentException("No value present"));
		} catch (IllegalArgumentException e) {
			System.out.println("Exception: " + e.getMessage()); // Output: Exception: No value present
		}

		// Example with method returning Optional
		Optional<String> optionalValue = findNameById(1);
		optionalValue.ifPresentOrElse(value -> System.out.println("Found: " + value),
				() -> System.out.println("Not found")); // Output: Found: John Doe

		Optional<String> optionalValue2 = findNameById(2);
		optionalValue2.ifPresentOrElse(value -> System.out.println("Found: " + value),
				() -> System.out.println("Not found")); // Output: Not found
	}

	// Method that returns an Optional
	public static Optional<String> findNameById(int id) {
		if (id == 1) {
			return Optional.of("John Doe");
		} else {
			return Optional.empty();
		}
	}
}
