package strings;

import java.util.HashMap;
import java.util.Map;

public class LaregestSubstring {
//	public static void main(String[] args) {
//		String s = "abbac";
//		String largest = null;
//		int largestSize = 0;
//		Map<Character, Integer> mp = new HashMap<>();
//		char[] a = s.toCharArray();
//		for (int i = 0; i < s.length(); i++) {
//			char ch = a[i];
//			if (!mp.containsKey(ch)) {
//				mp.put(ch, i);
//			} else {
//				i = mp.get(ch);
//				mp.clear();
//			}
//		}
//
//		if (mp.size() > largestSize) {
//			largestSize = mp.size();
//			largest = mp.keySet().toString();
//		}
//		System.out.println(largest);
//		System.out.println(largestSize);
//	}

	public static void main(String[] args) {
		String s = "abbac";
		findLargestSubstring(s);
	}

	public static void findLargestSubstring(String s) {
		if (s == null || s.isEmpty()) {
			System.out.println("The input string is null or empty.");
			return;
		}

		Map<Character, Integer> map = new HashMap<>();
		int start = 0;
		int maxLength = 0;
		String largestSubstring = "";

		for (int end = 0; end < s.length(); end++) {
			char ch = s.charAt(end);

			if (map.containsKey(ch)) {
				start = Math.max(map.get(ch) + 1, start); //update the start position to map.get(ch) + 1
			}

			map.put(ch, end);
			int currentLength = end - start + 1;

			if (currentLength > maxLength) {
				maxLength = currentLength;
				largestSubstring = s.substring(start, end + 1);
			}
		}

		System.out.println("Largest Substring: " + largestSubstring);
		System.out.println("Length: " + maxLength);
	}

}
