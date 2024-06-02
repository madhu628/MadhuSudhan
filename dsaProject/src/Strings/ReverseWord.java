package Strings;

public class ReverseWord {
//	public static void main(String[] args) {
//		String s = "java code";
//		String[] words = s.split("");
//		String output = " ";
//		for (String w : words) {
//			String rev = " ";
//			for (int i = w.length() - 1; i >= 0; i--) {
//				rev = rev + w.charAt(i);
//
//			}
//			output = output + rev + "";
//		}
//		System.out.println(output);
//	}
  
	//Using string builder
	public static void main(String[] args) {
		String str = "Think Twice";
		String[] arr = str.split(" ");
		StringBuilder result = new StringBuilder("");
		for (int i = arr.length - 1; i >= 0; i--) {
			if (i != 0) {
				result.append(arr[i] + " ");
			} else {
				result.append(arr[i]);
			}
		}
		System.out.println(result);
	}

}
