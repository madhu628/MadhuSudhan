package strings;

import java.util.Arrays;

public class Anagram {

//	public static void main(String[] args) {
//		String s1 = "Cat";
//		String s2 = "Act";
//		if (s1.length() == s2.length()) {
//			char[] ch1 = s1.toLowerCase().toCharArray();
//			char[] ch2 = s2.toLowerCase().toCharArray();
//
//			Arrays.sort(ch1);
//			Arrays.sort(ch2);
////	            Collections.sort(ch1); //  -- works only for List Implemented classes
//
//			s1 = new String(ch1);
//			s2 = new String(ch2);
//
//			if (s1.equals(s2)) {
//				System.out.println("Both Strings are Anagram");
//			} else {
//				System.out.println("Both Strings are not Anagram");
//			}
//
//		} else {
//			System.out.println("Both Strings are not Anagram");
//		}
//	}

	public static void main(String[] args) {
		String s1 = "Cat";
		String s2 = "Act";

		System.out.println(checkAnagrams(s1, s2));
	}

	private static boolean checkAnagrams(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		s1 = sortString(s1);
		s2 = sortString(s2);

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i))
				return false;
		}

		return true;
	}

	private static String sortString(String s) {
		char[] c = s.toLowerCase().toCharArray();
		Arrays.sort(c);
		return new String(c);
	}

}
