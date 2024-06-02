package Strings;

public class ConvertToUpper {

	public static void main(String[] args) {

		String s1 = "Smith";
		StringBuilder s2 = new StringBuilder("");
		char ch;

		for (int i = 0; i < s1.length(); i++) {
			ch = s1.charAt(i);
			if (ch >= 97 && ch <= 122) {
				int val = ch - 32;
				s2.append((char) val);
			} else {
				s2.append(ch);
			}
		}
		System.out.println(s2);

	}

}
