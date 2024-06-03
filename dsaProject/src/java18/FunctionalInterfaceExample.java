package java18;

@FunctionalInterface
interface MyFunctionalInterface {
	void myMethod(); // Abstract method

	default void myDefaultMethod() {
		// Default method
		System.out.println("Default method implementation");
	}

	static void myStaticMethod() {
		// Static method
		System.out.println("Static method implementation");
	}
}

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		// Using lambda expression to implement the abstract method of the functional
		// interface
		MyFunctionalInterface myInterface = () -> System.out.println("Lambda expression implementation");
		myInterface.myMethod(); // Output: Lambda expression implementation
		myInterface.myDefaultMethod();
	}
}
