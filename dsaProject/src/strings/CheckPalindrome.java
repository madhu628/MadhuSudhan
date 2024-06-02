package strings;

public class CheckPalindrome {
//	public static void main(String[] args) {
//		String s = "madamad";
//		int n = s.length();
//		boolean isPalindrome = checkPalindrome(s, n);
//		
//		if(isPalindrome) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
//	}
//
//	private static boolean checkPalindrome(String s, int n) {
//		char[] str = s.toCharArray();
//		int start = 0, end = n - 1;
//		while (start <= end) {
//			if (str[start] != str[end]) {
//				return false;
//			} else {
//				start++;
//				end--;
//			}
//		}
//		return true;
//	}
	public static void main(String[] args) {
		String s1 = "saasaas";
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		if (s1.equals(s2)) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is not a Palindrome");
		}
	}

}
