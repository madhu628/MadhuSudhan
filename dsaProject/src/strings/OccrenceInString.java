package strings;

import java.util.HashMap;
import java.util.Map;

public class OccrenceInString {
//	public static void main(String[] args) {
//		String s = "hello";
//		Map<Character, Integer> mp = new HashMap<>();
//		char[] a = s.toCharArray();
//		for(Character c:a) {
//			if(mp.containsKey(c)) {
//				mp.put(c, mp.get(c)+1);
//			}else {
//				mp.put(c, 1);
//			}
//		}
//		System.out.println(mp);
//	}
//	public static void main(String[] args) {
//		String s = "hello";
//		Map<Character, Integer> mp = new HashMap<>();
//
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if (mp.containsKey(ch)) {
//				mp.put(ch, mp.get(ch)+1);
//			}else {
//				mp.put(ch, 1);
//			}
//		}
//		System.out.println(mp);
//	}

	public static void main(String[] args) {
		String s = "hello";
		Map<Character, Integer> characterFrequencyMap = getCharacterFrequency(s);

		if (characterFrequencyMap != null) {
			System.out.println("Character frequencies: " + characterFrequencyMap);
		} else {
			System.out.println("Input string is null or empty.");
		}
	}

	private static Map<Character, Integer> getCharacterFrequency(String str) {
		if (str == null || str.isEmpty()) {
			return null; // Return null to indicate an invalid input
		}

		Map<Character, Integer> frequencyMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);//update logic by eliminating the need for a conditional check.
		}

		return frequencyMap;
	}

}
