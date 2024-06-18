package hashmap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog cat cat dog";
		boolean follows = wordPattern(pattern, s);
		System.out.println(follows);
	}

	private static boolean wordPattern(String pattern, String s) {

		// Split the string into words
		String[] words = s.split(" ");

		// If the lengths don't match, pattern cannot be followed
		if (pattern.length() != words.length) {
			return false;
		}

		// Maps to store mappings between pattern and words
		Map<Character, String> charToWord = new HashMap<>();
		Map<String, Character> wordToChar = new HashMap<>();

		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			String word = words[i];

			// Check mapping from character to word
			if (charToWord.containsKey(c)) {
				if (!charToWord.get(c).equals(word)) {
					return false; // Existing mapping does not match current word
				}
			} else {
				charToWord.put(c, word);
			}

			// Check mapping from word to character
			if (wordToChar.containsKey(word)) {
				if (!wordToChar.get(word).equals(c)) {
					return false; // Existing mapping does not match current character
				}
			} else {
				wordToChar.put(word, c);
			}

		}

		return true;
	}

}

//Time Complexity: O(n), where n is the length of pattern or the number of words in s. Each character and word are processed once.
//Space Complexity: O(n), for the hash maps used to store mappings.







