package strings;

public class CheckPalindrome {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";

//		String s1 = "madam";
//		boolean isPalindrome = s1.equals(new StringBuilder(s1).reverse().toString());
//		if (isPalindrome) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
		
		
		boolean isPalindrome = true;
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
		    if (s.charAt(i) != s.charAt(j)) {
		        isPalindrome = false;
		        break;
		    }
		}
		if (isPalindrome) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		System.out.println(checkPalindrome(s));
	}

	private static boolean checkPalindrome(String s) {

		if (s == null || s.length() == 0)
			return false;

		// s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

		// Convert to lowercase and filter out non-alphanumeric characters
		// Move left towards the right and right towards the left,
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				sb.append(Character.toLowerCase(c));
			}
		}
		System.out.println(sb);

		// Check for palindrome using two pointers
		int start = 0, end = sb.length() - 1;
		while (start < end) {
			if (sb.charAt(start) != sb.charAt(end)) {
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
