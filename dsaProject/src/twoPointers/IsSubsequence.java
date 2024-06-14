package twoPointers;

public class IsSubsequence {

	public static void main(String[] args) {
		String s1 = "abc";
		String t1 = "ahbgdc";

		System.out.println(isSubsequence(s1, t1));
	}

	private static boolean isSubsequence(String s, String t) {

		// Pointers for s and t
		int s1 = 0, t1 = 0;

		// Traverse the string t
		while (s1 < s.length() && t1 < t.length()) {

			// If characters match, move s1
			if (s.charAt(s1) == t.charAt(t1)) {
				s1++;
			}
			// Always move t1 regardless of matches
			t1++;
		}

		// If s1 has reached the end of s, all characters were found in t
		return s1 == s.length();

	}

}
