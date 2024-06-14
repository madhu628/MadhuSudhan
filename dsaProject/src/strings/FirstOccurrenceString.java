package strings;

public class FirstOccurrenceString {

	public static void main(String[] args) {

		String haystack = "sadbutsad";
		String needle = "sad";

		System.out.println(strtStr(haystack, needle));
	}

	private static int strtStr(String haystack, String needle) {

		return haystack != null ? haystack.indexOf(needle) : -1;

	}

}
