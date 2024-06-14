package oops;


//Definition: Exceptions that are not checked at compile-time but are checked at runtime.
//Handling: The programmer is not forced to handle these exceptions. If they are not caught, 
//they will propagate up the call stack and may cause the program to terminate.
//Common Examples: NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException

public class UncheckedExceptionExample {
	public static void divide(int a, int b) {
		// This line might throw an ArithmeticException at runtime
		int result = a / b;
		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {
		// Unchecked exceptions do not need to be explicitly handled
		divide(10, 0);
	}
}
