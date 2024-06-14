package strings;

public class IntToRoman {

	public static void main(String[] args) {
		int num = 3749;
		System.out.println(intToRoman(num)); // Output: "MMMDCCXLIX"
	}

	public static String intToRoman(int num) {

		String[] THOUSANDS = { "", "M", "MM", "MMM" };
		String[] HUNDREDS = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String[] TENS = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String[] ONES = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

		// Extract the components of the Roman numeral
		String thousands = THOUSANDS[num / 1000];
		String hundreds = HUNDREDS[(num % 1000) / 100];
		String tens = TENS[(num % 100) / 10];
		String ones = ONES[num % 10];

		// Concatenate the components to form the final Roman numeral
		return thousands + hundreds + tens + ones;
	}

}
