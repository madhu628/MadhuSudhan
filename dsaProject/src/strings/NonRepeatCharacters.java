package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeatCharacters {
//	public static void main(String[] args) {
//		String s= "AABCDBE";
//		Map<Character, Integer> mp = new HashMap<>();
//		for(int i=0;i<s.length();i++) {
//			char ch = s.charAt(i);
//			if(mp.containsKey(ch)) {
//				mp.put(ch, mp.get(ch)+1);
//			}else {
//				mp.put(ch, 1);
//			}
//		}
//		for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
//			if(entry.getValue()==1) {
//				System.out.println(entry.getKey());
//				break;
//			}
//		}
//	}

//	public static void main(String[] args) {
//		String s= "AABCDBE";
//		Map<Character, Integer> mp = new HashMap<>();
//		char[] a = s.toCharArray();
// 		for(Character ch :a) {
//			if(mp.containsKey(ch)) {
//				mp.put(ch, mp.get(ch)+1);
//			}else {
//				mp.put(ch, 1);
//			}
//		}
//		for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
//			if(entry.getValue()==1) {
//				System.out.println(entry.getKey());
//				break;
//			}
//		}
//	}

	public static void main(String[] args) {
		String s = "AACDCEB";
		Character result = findFirstNonRepeatingCharacter(s);
		if (result != null) {
			System.out.println("First non-repeating character: " + result);
		} else {
			System.out.println("No non-repeating character found.");
		}

		// Using streams
//		Map<Character, Long> charCount = s.chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
//		char firstNonRepeated = charCount.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey)
//				.findFirst().orElseThrow();
//
//		System.out.println(firstNonRepeated);

		// approach -2
		int[] count = new int[256]; // Assuming ASCII
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}
		char firstNonRepeated = '\0';
		for (int i = 0; i < s.length(); i++) {
			if (count[s.charAt(i)] == 1) {
				firstNonRepeated = s.charAt(i);
				break;
			}
		}
		System.out.println(firstNonRepeated);

	}

	private static Character findFirstNonRepeatingCharacter(String str) {
		if (str == null || str.isEmpty()) {
			throw new IllegalArgumentException("Input string is null or empty");
		}

		Map<Character, Integer> charCountMap = new LinkedHashMap<>(); // maintains the insertion order
		for (char ch : str.toCharArray()) {
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1); // character counts.
		}

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() == 1) { // find the first entry with a value of 1, indicating a non-repeating character
				return entry.getKey();
			}
		}

		return null;
	}

}
