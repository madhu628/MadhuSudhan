package maths;

public class DecimalToHexaDecimal {

	public static void main(String[] args) {
		int decimal = 271, rem;
		char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		String hexaDecimal = "";
		while (decimal > 0) {
			rem = decimal % 16;
			hexaDecimal = hex[rem] + hexaDecimal;
			decimal = decimal / 16;
		}
		System.out.println("hexaDecimal value:" + hexaDecimal);
	}

}
