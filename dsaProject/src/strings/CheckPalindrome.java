package strings;

public class CheckPalindrome {
	public static void main(String[] args) {
		String s = "madam";
		int n = s.length();

		System.out.println(checkPalindrome(s, n));
	}

	private static boolean checkPalindrome(String s, int n) {

		if (s == null || s.length() == 0)
			return false;

		int start = 0, end = n - 1;
		while (start <= end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;

		}
		return true;
	}
}
//	}
//	public static void main(String[] args) {
//		String s1 = "saasaas";
//		String s2 = "";
//		for (int i = s1.length() - 1; i >= 0; i--) {
//			s2 = s2 + s1.charAt(i);
//		}
//		if (s1.equals(s2)) {
//			System.out.println("Given String is Palindrome");
//		} else {
//			System.out.println("Given String is not a Palindrome");
//		}
//	}

//	public static void main(String[] args) {
//		String s1 = "saasaas";
//
//		if (isPalindrome(s1)) {
//			System.out.println("Given String is a Palindrome");
//		} else {
//			System.out.println("Given String is not a Palindrome");
//		}
//	}
//
//	private static boolean isPalindrome(String s) {
//		if (s == null || s.length() == 0)
//			return false;
//
//		StringBuilder reversed = new StringBuilder();
//		for (int i = s.length() - 1; i >= 0; i--) {
//			reversed.append(s.charAt(i));
//		}
//
//		return s.equals(reversed.toString());
//	}
