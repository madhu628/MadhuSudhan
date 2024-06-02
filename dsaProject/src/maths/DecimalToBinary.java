package maths;

public class DecimalToBinary {
//	public static void main(String[] args) {
//		int decimal = 11, binary = 0, i = 0, rem = 0;
//		while (decimal > 0) {
//			rem = decimal % 2;
//			binary = binary + (rem * power(10, i));
//			decimal = decimal / 2;
//			i++;
//		}
//		System.out.println(binary);
//
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
		int n = 5, ans = 0, i = 0;
		while (n != 0) {
			int digit = n & 1;
			ans = ans + (digit * pow(10, i));
			n = n >> 1;
			i++;
		}
		System.out.println(ans);
	}

	private static int pow(int base, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}
		return result;
	}

}
