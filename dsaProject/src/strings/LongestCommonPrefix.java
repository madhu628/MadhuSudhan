package strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] strs = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(strs));
	}

	private static String longestCommonPrefix(String[] strs) {

//		if (strs == null || strs.length == 0) return "";
//		
//		// Initialize the prefix as the first string in the array
//        String prefix = strs[0];
//		
//     // Compare the prefix with each string in the array
//        for (int i = 1; i < strs.length; i++) {
//            // Update the prefix while it does not match the beginning of the current string
//            while (strs[i].indexOf(prefix) != 0) {
//                // Reduce the prefix
//                prefix = prefix.substring(0, prefix.length() - 1);
//                // If no common prefix exists
//                if (prefix.isEmpty()) return "";
//            }
//        }
//		return prefix;

		if (strs == null || strs.length == 0)
			return "";

		for (int i = 0; i < strs[0].length(); i++) {
			char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				// If out of bounds or mismatch found
				if (i >= strs[j].length() || strs[j].charAt(i) != c) {
					return strs[0].substring(0, i);
				}
			}
		}

		return strs[0];

	}

}
