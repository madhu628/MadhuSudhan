package java18;

@FunctionalInterface
interface Calculator {
	int calculate(int a, int b);
}

public class FunctionalExample {
	public static void main(String[] args) {
		Calculator addition = (a, b) -> a + b;
		Calculator multiplication = (a, b) -> a * b;

		System.out.println("Addition: " + addition.calculate(10, 5)); // 15
		System.out.println("Multiplication: " + multiplication.calculate(10, 5)); // 50
	}
}
