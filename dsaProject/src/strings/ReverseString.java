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

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = "madhu";
		if (str == null) {
			System.out.println("Input is null");
			return;
		}

		StringBuilder reverseStr = new StringBuilder(str);
		reverseStr.reverse(); // Using built-in reverse method

		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(reversed);
		
		System.out.println("**************************");

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr.append(str.charAt(i));
		}
		System.out.println(reverseStr);
		
		System.out.println("***************************");

		char[] chars = str.toCharArray();
		for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		String reversed1 = new String(chars);
		System.out.println(reversed1);

	}

}
