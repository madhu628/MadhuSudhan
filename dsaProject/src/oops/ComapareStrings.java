package oops;

public class ComapareStrings {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		if (str1.equals(str2)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}

		String str3 = "hello";
		String str4 = new String("hello");
		if (str3 == str4) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are  not equal");
		}
		
		String str5 = new String("hello");
		String str6 = new String("hello");
		if (str5 == str6) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are  not equal");
		}

	}

}
