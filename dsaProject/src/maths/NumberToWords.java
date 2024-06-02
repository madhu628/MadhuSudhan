package maths;

public class NumberToWords {

	private static final String[] units = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	private static final String[] tens = { "", // 0
			"", // 1
			"Twenty", // 2
			"Thirty", // 3
			"Forty", // 4
			"Fifty", // 5
			"Sixty", // 6
			"Seventy", // 7
			"Eighty", // 8
			"Ninety" // 9
	};

	public static String convert(int number) {
		if (number == 0) {
			return units[0];
		}

		StringBuilder words = new StringBuilder();

		if (number >= 1000) {
			words.append(units[number / 1000]).append(" Thousand ");
			number %= 1000;
		}

		if (number >= 100) {
			words.append(units[number / 100]).append(" Hundred ");
			number %= 100;
		}

		if (number >= 20) {
			words.append(tens[number / 10]).append(" ");
			number %= 10;
		}

		if (number > 0) {
			words.append(units[number]).append(" ");
		}

		return words.toString().trim();
	}

	public static void main(String[] args) {
		int[] testNumbers = { 1, 1000, 1362 };
		for (int number : testNumbers) {
			System.out.println(number + " in words is: " + convert(number));
		}
	}
}
