package strings;

public class ReverseWord {
//	public static void main(String[] args) {
//		String s = "java code";
//		String[] words = s.split(" ");// Split by space to get words
//		String output = ""; // Initialize output as an empty string
//		for (String w : words) {
//			String rev = "";// Initialize rev as an empty string for each word
//			for (int i = w.length() - 1; i >= 0; i--) {
//				rev = rev + w.charAt(i);// Build the reversed word
//
//			}
//			output = output + rev + " ";// Add the reversed word to output with a space
//		}
//		System.out.println(output.trim());// Trim to remove trailing space
//	}

	// Using string builder
//	public static void main(String[] args) {
//		String str = "Think Twice";
//		String[] arr = str.split(" ");
//		StringBuilder result = new StringBuilder("");
//		for (int i = arr.length - 1; i >= 0; i--) {
//			if (i != 0) {
//				result.append(arr[i] + " ");
//			} else {
//				result.append(arr[i]);
//			}
//		}
//		System.out.println(result);
//	}

	public static void main(String[] args) {
		reverseWords("Think Twice");
	}

	private static void reverseWords(String str) {
		if (str == null || str.trim().isEmpty()) {
			System.out.println("Input is empty or null");
			return;
		}

		String[] arr = str.trim().split("\\s+"); // Split by one or more spaces
		StringBuilder result = new StringBuilder(str.length());

		
		for (int i = arr.length - 1; i >= 0; i--) {
			result.append(arr[i]);
			if (i != 0) {
				result.append(" ");// Append a space after each word except the last one
			}
		}

		System.out.println("Original: \"" + str + "\"");
		System.out.println("Reversed: \"" + result.toString() + "\"");
		System.out.println();
	}

}
