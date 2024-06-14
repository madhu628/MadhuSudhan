package strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public static void main(String[] args) {

		String s = "III";

		System.out.println(romanToInt(s));
	}

	private static int romanToInt(String s) {

//		// Create a map for Roman numeral values
//		Map<Character, Integer> romanValues = new HashMap<>();
//		romanValues.put('I', 1);
//		romanValues.put('V', 5);
//		romanValues.put('X', 10);
//		romanValues.put('L', 50);
//		romanValues.put('C', 100);
//		romanValues.put('D', 500);
//		romanValues.put('M', 1000);
//
//		// Initialize total to the value of the last character
//		int total = romanValues.get(s.charAt(s.length() - 1));
//
//		// Traverse the string from the second-to-last character to the first character
//		for (int i = s.length() - 2; i >= 0; i--) {
//			// If the current character is smaller than the next one, subtract its value
//			if (romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i + 1))) {
//				total -= romanValues.get(s.charAt(i));
//			} else {
//				// Otherwise, add its value
//				total += romanValues.get(s.charAt(i));
//			}
//		}
//
//		return total;
//
//	}
		HashMap<Character, Integer> hm = new HashMap<>();

		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		int prev = 0;
		int ans = 0;
		int l = s.length();
		for (int i = l - 1; i >= 0; i--) {
			int curr = hm.get(s.charAt(i));

			if (curr < prev) {
				ans = ans - curr;
			} else {
				ans = ans + curr;
			}
			prev = curr;

		}

		return ans;
	}

}
