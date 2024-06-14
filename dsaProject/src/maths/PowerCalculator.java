package maths;

public class PowerCalculator {
	public double myPow(double x, int n) {
		if (n == 0)
			return 1.0;
		if (x == 0)
			return 0.0;

		long absN = Math.abs((long) n); // Use long to handle overflow for n = Integer.MIN_VALUE //as converting Integer.MIN_VALUE to positive would cause overflow.
		double result = 1.0;
		double base = x;

		while (absN > 0) {
			if ((absN & 1) == 1) { // If n is odd
				result *= base;
			}
			base *= base; // Square the base
			absN >>= 1; // Divide n by 2 // right shift to divide it by 2
		}

		
		//If n is negative, return 1 / result to handle the case where the exponent is negative
		return n < 0 ? 1 / result : result;
	}

	public static void main(String[] args) {
		PowerCalculator calculator = new PowerCalculator();

		double x = 2.00000;
		int n = 10;
		double result = calculator.myPow(x, n);

		System.out.printf("pow(%.5f, %d) = %.5f\n", x, n, result);
	}
}
