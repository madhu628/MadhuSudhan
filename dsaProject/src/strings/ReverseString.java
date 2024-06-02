package strings;

public class ReverseString {
//	public static void main(String[] args) {
//		String s = "java";
//		char[] a = s.toCharArray();
//		for (int i = a.length - 1; i >= 0; i--) {
//			System.out.print(a[i]);
//		}
//		System.out.println();
//		for (int i = s.length() - 1; i >= 0; i--) {
//			System.out.print(s.charAt(i));
//		}
//	}

//	public static void main(String[] args) {
//		String s = "madhu";
//		int len = s.length();
//		System.out.println(reverse(s, len));
//	}
//
//	private static String reverse(String s, int len) {
//		char[] str = s.toCharArray();
//		int start = 0, end = len - 1;
//		while (start < end) {
//			char temp = str[start];
//			str[start] = str[end];
//			str[end] = temp;
//			start++;
//			end--;
//
//		}
//		return new String(str);
//	}

	public static void main(String[] args) {
		String str = "madhu";
		StringBuilder reverseStr = new StringBuilder("");

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr.append(str.charAt(i));
		}
		System.out.println(reverseStr);
	}

}
