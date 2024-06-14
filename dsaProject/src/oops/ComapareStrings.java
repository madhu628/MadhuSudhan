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

		String str7 = "hello";
		String str8 = "hello";
		if (str7 == str8) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}

		String str31 = "hello";
		String str41 = new String("hello");
		if (str31.equals(str41)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are  not equal");
		}

		String str3 = "hello";
		String str4 = new String("hello");
		if (str3 == str4) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are  not equal");
		}

		String str51 = new String("hello");
		String str61 = new String("hello");
		if (str51.equals(str61)) {
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
