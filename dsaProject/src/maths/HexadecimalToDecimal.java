package maths;

public class HexadecimalToDecimal {

	public static void main(String[] args) {
		String digits = "0123456789ABCDEF";
		String hexaInput = "10F";
		hexaInput = hexaInput.toUpperCase();
		int decimal = 0;
		for (int i = 0; i < hexaInput.length(); i++) {
			char ch = hexaInput.charAt(i);
			int value = digits.indexOf(ch);
			decimal = 16 * decimal + value;
		}
		System.out.println(decimal);
	}

}
