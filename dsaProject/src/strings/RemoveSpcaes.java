package strings;

public class RemoveSpcaes {
	public static void main(String[] args) {
		String s= "j a v a";
		String s1 = s.replaceAll("\\s", "");
		System.out.println(s1);
	}

}
