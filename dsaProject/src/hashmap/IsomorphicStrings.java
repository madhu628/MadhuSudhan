package hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	public static void main(String[] args) {
		String s = "egg";
		String t = "add";
		boolean isIsomorphic = isIsomorphic(s, t);
		System.out.println("Are the strings isomorphic? " + isIsomorphic); // Expected output: true
	}

	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		// Create two hash maps to store mappings from s to t and t to s
		Map<Character, Character> mapST = new HashMap<>();
		Map<Character, Character> mapTS = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char charS = s.charAt(i);
			char charT = t.charAt(i);

			// Check existing mapping from s to t
			if (mapST.containsKey(charS)) {
				if (mapST.get(charS) != charT) { //if doesn't match the current character in t
					return false;
				}
			} else {
				mapST.put(charS, charT);//If no mapping exists, add it to the respective maps
			}

			// Check existing mapping from t to s
			if (mapTS.containsKey(charT)) {
				if (mapTS.get(charT) != charS) {
					return false;
				}
			} else {
				mapTS.put(charT, charS);
			}
		}

		return true;
	}

}

//Time Complexity: O(n), where n is the length of the strings. Each character is processed once.
//Space Complexity: O(n), for the hash maps used to store mappings. In the worst case, each character is mapped
//


