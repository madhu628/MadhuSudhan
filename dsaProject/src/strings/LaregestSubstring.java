package strings;

import java.util.HashMap;
import java.util.Map;

public class LaregestSubstring {
	public static void main(String[] args) {
		String s = "abbac";
		String largest = null;
		int largestSize = 0;
		Map<Character, Integer> mp = new HashMap<>();
		char[] a = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			char ch = a[i];
			if (!mp.containsKey(ch)) {
				mp.put(ch, i);
			} else {
				i = mp.get(ch);
				mp.clear();
			}
		}

		if (mp.size() > largestSize) {
			largestSize = mp.size();
			largest = mp.keySet().toString();
		}
		System.out.println(largest);
		System.out.println(largestSize);
	}

}
