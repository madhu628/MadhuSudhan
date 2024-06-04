package strings;

public class CopyOneStringToAnother {

//	public static void main(String[] args) {
//		String str = "madhu";
//        StringBuilder copyString = new StringBuilder("");
//
//        for(int i=0;i<str.length();i++){
//            copyString.append(str.charAt(i));
//        }
//        System.out.println(copyString);
//	}

	public static void main(String[] args) {
		String str = "madhu";
		System.out.println(copyString(str));
	}

	private static String copyString(String str) {
		if (str == null)
			return null;
		if (str.isEmpty())
			return "";

		StringBuilder copyString = new StringBuilder(str.length());
		for (int i = 0; i < str.length(); i++) {
			copyString.append(str.charAt(i));
		}
		return copyString.toString();
	}

}
