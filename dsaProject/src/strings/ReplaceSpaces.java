package strings;

public class ReplaceSpaces {

	public static void main(String[] args) {
		String s = "my name is madhu";
		String res = replaceSpaces(s);
		System.out.println(res);

		// Additional test cases
		System.out.println(replaceSpaces("")); // Empty string
		System.out.println(replaceSpaces("noSpacesHere")); // No spaces
		System.out.println(replaceSpaces(" leading and trailing ")); // Leading and trailing spaces
		System.out.println(replaceSpaces("multiple   spaces")); // Multiple consecutive spaces

	}

	private static String replaceSpaces(String s) {
		StringBuilder temp = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				temp.append('@');
				temp.append('4');
				temp.append('o');
			} else {
				temp.append(s.charAt(i));
			}

		}
		return temp.toString();

	}

}
