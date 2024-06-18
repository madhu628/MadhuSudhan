package hashmap;

public class ValidAnagram {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		boolean isAnagram = isAnagram(s, t);
		System.out.println("Are the strings anagrams? " + isAnagram); // Expected output: true
	}

	private static boolean isAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}
		// Create a frequency array for 26 lowercase English letters
		int[] charCount = new int[26];

		// Increment frequency for characters in s
		for (char c : s.toCharArray()) {
			charCount[c - 'a']++; // increment the count of each character 
		}

		// Decrement frequency for characters in t
		for (char c : t.toCharArray()) {
			charCount[c - 'a']--; //decrement the count of each character
		}

		// Check if all counts in charCount are zero
		for (int count : charCount) { // If any count is non-zero, s and t are not anagrams
			if (count != 0) {
				return false;
			}
		}

		return true; 
	}

}

//Time Complexity: O(n), where n is the length of the strings. Each character is processed twice (once for counting and once for checking).
//Space Complexity: O(1), since the frequency array uses a fixed size of 26 elements






