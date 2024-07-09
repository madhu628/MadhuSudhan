package strings;

import java.util.Arrays;

public class SortCharecters {
//	public static void main(String[] args) {
//		String s= "java";
//		char temp;
//		char[] a = s.toCharArray();
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		System.out.println(a);
//	}

	public static void main(String[] args) {
		sortAndPrint("java");
	}

	private static void sortAndPrint(String s) {
		if (s == null || s.isEmpty()) {
			System.out.println("Input is empty or null");
			return;
		}

		char[] charArray = s.toCharArray();
		Arrays.sort(charArray); // Using built-in sorting

		
		System.out.println( new String(charArray));
		
	}

}
