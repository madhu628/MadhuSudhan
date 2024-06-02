package strings;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
		String s = "$mad";
		String str = s.replaceAll("[a-zA-z0-9]", "  ");
		System.out.println(str);
	}

}
