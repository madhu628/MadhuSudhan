package bitManipulation;

public class AddBinary {

	public static void main(String[] args) {

		System.out.println(addBinary("11", "1"));

	}

	private static String addBinary(String s1, String s2) {

		StringBuilder result = new StringBuilder();

		int i = s1.length() - 1;
		int j = s2.length() - 1;

		int carry = 0;

		 // Iterate through both strings from the end to the beginning
		//For each bit position, the sum of the bits from a and b and the carry is calculated
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0) {
				sum += s1.charAt(i) - '0';
				i--;
			}

			if (j >= 0) {
				sum += s2.charAt(j) - '0';
				j--;
			}
			 // Calculate the current bit and update the carry
			result.append(sum % 2);
			carry = sum / 2;

		}

		//Handle Remaining Carry
		if (carry != 0) {
			result.append(carry);
		}
		// Reverse the result since we appended bits in reverse order
		return result.reverse().toString();
	}

}

//Time Complexity: O(max(n, m)) where n and m are the lengths of the strings a and b, respectively. The algorithm processes each bit once.
//Space Complexity: O(max(n, m)) to store the result. The StringBuilder grows to the size of the longer input string plus one additional bit if there's a carry.
//
