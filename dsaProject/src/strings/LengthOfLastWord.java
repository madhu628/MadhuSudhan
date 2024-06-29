package strings;

public class LengthOfLastWord {

	public static void main(String[] args) {

		String s = "Hello World";
		System.out.println(lengthOfLastWord(s));
	}

	public static int lengthOfLastWord(String s) {
		s = s.trim();
		int lastIndex = s.lastIndexOf(' ') + 1;
		
		System.out.println(lastIndex);
		return s.length() - lastIndex;

//		int length = 0;
//		int i = s.length() - 1;

		// Skip trailing spaces
//		while (i >= 0 && s.charAt(i) == ' ') {
//			i--;
//		}
		
		//s = s.trim(); // trim or  Skip trailing spaces

		// Count the length of the last word
//		while (i >= 0 && s.charAt(i) != ' ') {
//			length++;
//			i--;
//		}
//
//		return length;
	}
}
