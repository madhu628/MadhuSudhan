package strings;

public class RemoveOccrences {
	public static void main(String[] args) {
		String s = "daabcbaabcbc";
		String part = "abc";
		String res = removeOccurrences(s, part);
		System.out.println(res);
	}

//	private static String removeOccurrences(String s, String part) {
//	    while(s.length()!=0 && s.indexOf(part) < s.length()) {
//	    	s.replaceFirst(s.indexOf(part),part.length());
//	    }
//		return s;
//	}
//	private static String removeOccurrences(String s, String part) {
//        while (s.contains(part)) {
//            s = s.replaceFirst(part, "");
//        }
//        return s;
//    }
	private static String removeOccurrences(String s, String part) {
		if (s == null || part == null || s.isEmpty() || part.isEmpty()) {
			return s; // Handle null or empty input cases
		}

		StringBuilder sb = new StringBuilder(s);
		int partLength = part.length();
		int index;

		while ((index = sb.indexOf(part)) != -1) { //searches for the substring part using indexOf.
			sb.delete(index, index + partLength);
		}

		return sb.toString();
	}

}
