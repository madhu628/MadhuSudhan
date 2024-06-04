package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharacters {

//	public static void main(String[] args) {
//		String s = " madam";
////		StringBuilder sb = new StringBuilder();
////		s.chars().distinct().forEach(c -> sb.append((char) c));
////		System.out.println(sb);
//
//		StringBuilder sb = new StringBuilder();
//		s.chars().distinct().forEach(c -> {
//			// Append only if the character is not already in the StringBuilder
//			if (sb.indexOf(String.valueOf((char) c)) == -1) {
//				sb.append((char) c);
//			}
//		});
//
//		System.out.println(sb.toString());
//	}

	public static void main(String[] args) {
		String s = " madam";
		System.out.println(removeDuplicateCharacters(s));
	}

	public static String removeDuplicateCharacters(String s) {
		if (s == null || s.isEmpty()) {
			return s; // Return the original string if it is null or empty
		}

		s = s.trim(); // Trim leading and trailing spaces
//		LinkedHashSet maintains the insertion order and automatically handles duplicates. This eliminates the need for the
//		distinct() method and additional checks
		Set<Character> charSet = new LinkedHashSet<>();
		for (char c : s.toCharArray()) {
			charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character c : charSet) {
			sb.append(c);
		}

		return sb.toString();
	}

}
