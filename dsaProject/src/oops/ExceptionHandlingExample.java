package oops;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		try {
			// Code that may throw an exception
			int divideByZero = 5 / 0;
			System.out.println("This line will not be executed.");
		} catch (ArithmeticException e) {
			// Handling the exception
			System.out.println("ArithmeticException caught: Division by zero.");
		} finally {
			// This block is always executed
			System.out.println("Finally block executed.");
		}

		// Handling multiple exceptions
		try {
			int[] arr = new int[5];
			arr[10] = 50; // This will throw ArrayIndexOutOfBoundsException
			System.out.println("This line will not be executed.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("General exception caught: " + e.getMessage()); 
		}

		// Throwing an exception
		try {
			validateAge(15); // This will throw an exception
		} catch (InvalidAgeException e) {
			System.out.println("Caught custom exception: " + e.getMessage());
		}
	}

	// Method that throws a custom exception
	static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above to vote.");
		}
	}

}

//Custom Exception
class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}
