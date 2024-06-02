package maths;

public class OctalToDecimal {

	public static void main(String[] args) {
		int octal = 303, decimal = 0, rem = 0, i = 0;
		while (octal > 0) {
			rem = octal % 10;
			decimal = decimal + (rem * power(8, i));
			i++;
			octal = octal / 10;
		}
		System.out.println(decimal);
	} 

	private static int power(int base, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}
		return result;
	}

}
