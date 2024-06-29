package strings;

public class RemoveVowels {

	public static void main(String[] args) {
		String s = " madhu";
		String withoutVowels = s.replaceAll("[AEIOUaeiou]", "");

		System.out.println(withoutVowels);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ("AEIOUaeiou".indexOf(c) == -1) {
				sb.append(c);
			}
		}
		String withoutVowels1 = sb.toString();

		System.out.println(withoutVowels1);

	}

}
