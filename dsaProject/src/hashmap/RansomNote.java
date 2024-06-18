package hashmap;

import java.util.HashMap;

public class RansomNote {

	public static void main(String[] args) {
		String ransomNote = "aa";
		String magazine = "aab";
		boolean canConstruct = canConstructRansomNote(ransomNote, magazine);
		System.out.println("Can construct ransom note: " + canConstruct); // Expected output: false
	}

	// public static boolean canConstructRansomNote(String ransomNote, String
	// magazine) {
	// Frequency array for characters
//		int[] charCount = new int[26];
//
//		// Count the frequency of each character in the magazine
//		for (char c : magazine.toCharArray()) {
//			charCount[c - 'a']++;
//		}
//
//		// Check if ransomNote can be constructed
//		for (char c : ransomNote.toCharArray()) {
//			if (charCount[c - 'a'] == 0) {
//				return false; //  magazine Not enough characters in magazine
//			}
//			charCount[c - 'a']--; // Use the character //Decrease the count of the character in charCount as it is used
//		}
//
//		return true; // Ransom note can be constructed

	// Using hashmap:
	public static boolean canConstructRansomNote(String ransomNote, String magazine) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : magazine.toCharArray())
			map.put(c, map.getOrDefault(c, 0) + 1);

		for (char c : ransomNote.toCharArray()) {
			if (!map.containsKey(c) || map.get(c) < 1)
				return false;
			map.put(c, map.get(c) - 1);
		}

		return true;
	}

}

//Time Complexity: O(n + m), where n is the length of the ransomNote and m is the length of the magazine. Each string is iterated over once.
//Space Complexity: O(1), since the charCount array uses a fixed size of 26 elements, irrespective of input size.
