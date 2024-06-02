package Strings;

public class StringLength {
	public static void main(String[] args) {
		String s = "madhu";
		System.out.println(length(s));
	}

	private static int length(String s) {
		int count=0 ;
		for(int i=0;i<s.length();i++) {
			count++;
			
		}
		return count;
	}

}
