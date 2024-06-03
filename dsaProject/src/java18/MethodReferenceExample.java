package java18;

import java.util.function.Function;

class MethodReferenceExample {

	// Static method
	static String toUpperCase(String str) {
		return str.toUpperCase();
	}

	// Instance method
	String toLowerCase(String str) {
		return str.toLowerCase();
	}

	public static void main(String[] args) {
		// Reference to a static method
		Function<String, String> staticMethodRef = MethodReferenceExample::toUpperCase;
		System.out.println("Static Method Reference: " + staticMethodRef.apply("Hello"));

		// Reference to an instance method of a particular object
		MethodReferenceExample instance = new MethodReferenceExample("madhu");
		Function<String, String> instanceMethodRef = instance::toLowerCase;
		System.out.println("Instance Method Reference: " + instanceMethodRef.apply("HELLO"));

		// Reference to an instance method of an arbitrary object of a particular type
		Function<String, String> arbitraryObjectMethodRef = String::toLowerCase;
		System.out.println("Arbitrary Object Method Reference: " + arbitraryObjectMethodRef.apply("HELLO"));

		// Reference to a constructor
		Function<String, MethodReferenceExample> constructorRef = MethodReferenceExample::new;
		MethodReferenceExample obj = constructorRef.apply("hello");
		System.out.println("Constructor Reference: " + obj.toLowerCase("HELLO"));
	}

	// Constructor
	MethodReferenceExample(String str) {
		System.out.println("Object created with: " + str);
	}
}
