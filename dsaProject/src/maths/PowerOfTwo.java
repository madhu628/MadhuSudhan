package maths;

public class PowerOfTwo {

	public static void main(String[] args) {
		int n = 16;

		System.out.println(power(n));

	}

	private static boolean power(int n) {

		for (int i = 0; i <= 30; i++) {
			int ans = pow(2, i);
			if (ans == n) {
				return true;
			}
		}
		return false;

	}

	private static int pow(int base, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}
		return result;
	}

}
