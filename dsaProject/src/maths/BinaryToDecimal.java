package maths;

public class BinaryToDecimal {

//	public static void main(String[] args) {
//		int binary = 1011, decimal = 0, i = 0, rem = 0;
//		while (binary > 0) {
//			rem = binary % 10;
//			decimal = decimal + (rem * power(2, i));
//			i = i + 1;
//			binary = binary / 10;
//		}
//		System.out.println(decimal);
//	}
//
//	public static int power(int value, int c) {
//		int res = 1;
//		for (int i = 1; i <= c; i++) {
//			res = res * value;
//		}
//		return res;
//	}
	public static void main(String[] args) {
		int i = 0, ans = 0, n = 1011;
		while (n != 0) {
			int bit = n % 10;
			if (bit == 1) {
				ans = ans + pow(2, i);
			}
			n = n / 10;
			i++;
		}
		System.err.println(ans);
	}

	private static int pow(int base, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}
		return result;
	}

}
