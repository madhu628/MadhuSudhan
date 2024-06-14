package oops;

//Example of Compile-Time Polymorphism (Method Overloading) 
//same method with different parameters

class Calculator {

	// Method to add two integers
	public int add(int a, int b) {
		return a + b;
	}

	// Overloaded method to add three integers
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	// Overloaded method to add two double numbers
	public double add(double a, double b) {
		return a + b;
	}
}

//Main class to test method overloading
public class CompileTimeORStatic1 {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		// Calling the first add method
		int sum1 = calc.add(10, 20);
		System.out.println("Sum of 10 and 20: " + sum1); // Output: Sum of 10 and 20: 30

		// Calling the second add method
		int sum2 = calc.add(10, 20, 30);
		System.out.println("Sum of 10, 20 and 30: " + sum2); // Output: Sum of 10, 20 and 30: 60

		// Calling the third add method
		double sum3 = calc.add(10.5, 20.5);
		System.out.println("Sum of 10.5 and 20.5: " + sum3); // Output: Sum of 10.5 and 20.5: 31.0
	}
}
