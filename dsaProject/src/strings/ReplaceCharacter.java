package strings;

public class ReplaceCharacter {

//	public static void main(String[] args) {
//		 String s= "opentext";
//		 char ch = 't';
//		 if(s.indexOf(ch)==-1) {
//			 System.out.println("not available");
//		 }
//		 int count =1;
//		 for(int i=0;i<s.length();i++) {
//			 char c =s.charAt(i);
//			 if(c==ch) {
//				 s=s.replaceFirst(String.valueOf(ch), String.valueOf(count));
//				 count++;
//			 }
//		 }
//		 System.out.println(s);
//	}

	public static void main(String[] args) {
		testStringReplacement("opentext", 't');
	}

	private static void testStringReplacement(String s, char ch) {
		

		if (s.indexOf(ch) == -1) {
			System.out.println("Character not available");
			return;
		}

		int count = 1;
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ch) {
				result.append(count);
				count++;
			} else {
				result.append(c);
			}
		}
		System.out.println("Modified: \"" + result.toString() + "\"");
	}

}
