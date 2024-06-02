package Strings;

public class RemoveOccrences {
	public static void main(String[] args) {
		String s = "daabcbaabcbc";
		String part ="abc";
		String res =removeOccurrences( s,  part);
		System.out.println(res);
	}
//	private static String removeOccurrences(String s, String part) {
//	    while(s.length()!=0 && s.indexOf(part) < s.length()) {
//	    	s.replaceFirst(s.indexOf(part),part.length());
//	    }
//		return s;
//	}
	private static String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }
}
