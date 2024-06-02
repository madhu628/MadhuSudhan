package maths;

public class DecimalToOctal {

	public static void main(String[] args) {
		int decimal = 1080, octal = 0, i = 0, rem;
		while (decimal > 0) {
			rem = decimal % 8;
			octal = octal + (rem * power(10, i));
			i++;
			decimal = decimal / 8;
		}
		System.out.println("octal value:" + octal);

	}

	public static int power(int base, int pow) {
		int result = 1;
		for (int i = 1; i <= pow; i++) {
			result = result * base;
		}
		return result;
	}

}
