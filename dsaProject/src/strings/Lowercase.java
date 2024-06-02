package strings;

public class Lowercase {
	public static void main(String[] args) {

		System.out.println(lowerCase('B'));
	}

	private static char lowerCase(char ch) {
		if (ch >= 'a' && ch <= 'z') {
			return ch;
		} else {
			char temp = (char) (ch - 'A' + 'a');
			return temp;
		}
	}
}
