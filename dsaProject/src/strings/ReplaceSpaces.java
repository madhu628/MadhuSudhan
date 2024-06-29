package strings;

public class ReplaceSpaces {

	public static void main(String[] args) {
		String s = "my name is madhu";
		String res = replaceSpaces(s);
		System.out.println(res);

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
