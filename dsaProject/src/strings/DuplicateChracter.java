package strings;

import java.util.HashSet;

public class DuplicateChracter {
	public static void main(String[] args) {
		String s = "madam";
		HashSet<Character> hs = new HashSet<>();
		char[] a = s.toCharArray();
		for (char c : a) {
			if (hs.contains(c)) {
				System.out.println(c + " ");
			} else {
				hs.add(c);
			}

		}
	}

}
