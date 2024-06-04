package strings;

//to remove char "i" between 2 char to second last char

//input-iigii"  o/p= igi

public class RemoveCharInBtw {

//	public static void main(String[] args) {
//
//		String str = "iigii"; // Order By salary DESC Limit 1,1
//		String output = "";
//
//		for (int i = 0; i < str.length(); i++) {
//			if (i != 0 && i != str.length() - 1) {
//				if (!(str.charAt(i) == 'i')) {
//					output = output + str.charAt(i);
//				}
//			} else {
//				output = output + str.charAt(i);
//			}
//
//		}
//		System.out.println(output);
//
//	}

	public static void main(String[] args) {
		String str = "iigii"; // Sample input
		String output = removeMiddleIs(str);
		System.out.println(output);
	}

	private static String removeMiddleIs(String str) {
		if (str == null || str.length() <= 2) {
			return str; // If the string is null or has length 2 or less, return it as is
		}

		StringBuilder output = new StringBuilder();
		output.append(str.charAt(0)); // Always append the first character

		for (int i = 1; i < str.length() - 1; i++) {
			char currentChar = str.charAt(i);
			if (currentChar != 'i') {    //appending characters that are not 'i'.
				output.append(currentChar);
			}
		}

		output.append(str.charAt(str.length() - 1)); // Always append the last character

		return output.toString();
	}

}
