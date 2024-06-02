package Strings;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String s = " madam";
//		StringBuilder sb = new StringBuilder();
//		s.chars().distinct().forEach(c -> sb.append((char) c));
//		System.out.println(sb);

		StringBuilder sb = new StringBuilder();
		s.chars().distinct().forEach(c -> {
			// Append only if the character is not already in the StringBuilder
			if (sb.indexOf(String.valueOf((char) c)) == -1) {
				sb.append((char) c);
			}
		});

		System.out.println(sb.toString());
	}
}
