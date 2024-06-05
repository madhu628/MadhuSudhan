package strings;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
		String s = "$mad";
		String str = s.replaceAll("[a-zA-Z0-9]", "  ");
		System.out.println(str);

//Approach2
		String[] testStrings = { "$mad", "", "123", "ABCdef", "!@#$%^", "a1B2$3c4D5" };

		for (String s1 : testStrings) {
			String st = s1.replaceAll("[a-zA-Z0-9]", "  ");
			System.out.println("Original: \"" + s + "\", Modified: \"" + st + "\"");
		}
	}

}
