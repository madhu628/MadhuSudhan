package strings;

public class RemoveSpcaes {
//	public static void main(String[] args) {
//		String s= "j a v a";
//		String s1 = s.replaceAll("\\s", "");
//		System.out.println(s1);
//	}

	public static void main(String[] args) {
		String s = "j a v a";
		String result = removeWhitespaces(s);
		System.out.println(result); // Expected output: "java"
	}

	private static String removeWhitespaces(String s) {
		if (s == null || s.isEmpty()) {
			return s; // Return the input string if it's null or empty
		}

		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (!Character.isWhitespace(c)) { // if the character is not whitespace not append it
				sb.append(c);
			}
		}

		return sb.toString();
	}

}
