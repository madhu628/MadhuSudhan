package strings;

import java.util.HashSet;
import java.util.Set;

public class Panagram {

//	public static void main(String[] args) {
//		String str = "The quick brown fox jumps over the lazy dog";
//        boolean[] check = new boolean[26];
//        int flag = 1, val;
//        str = str.toLowerCase();
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
//                val=str.charAt(i)-'a';
//                check[val] = true;
//            }
//        }
//        for(int i=0;i<26;i++){
//            if(!check[i]){
//                flag = 0;
//                break;
//            }
//        }
//        if(flag==1){
//            System.out.println("Given String is Pangram");
//        }
//        else{
//            System.out.println("Given String is not Pangram");
//        }
//	}

//	public static void main(String[] args) {
//		String str = "The quick brown fox jumps over the lazy dog";
//		System.out.println(isPanagram(str.toLowerCase()));
//	}
//
//	private static boolean isPanagram(String s) {
//		
//		if (s == null || s.isEmpty()) {
//            return false; // Handle null or empty input
//        }
//		
//		if (s.length() < 26)
//			return false;
//		else {
//			for (char ch = 'a'; ch <= 'z'; ch++) {
//				if (s.indexOf(ch) < 0) {
//					return false;
//				}
//
//			}
//			return true;
//		}
//	}
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println(isPangram(str));
	}

	private static boolean isPangram(String s) {
		if (s == null || s.isEmpty()) {
			return false; // Handle null or empty input
		}

		Set<Character> uniqueChars = new HashSet<>();
		for (char ch : s.toLowerCase().toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				uniqueChars.add(ch);
			}
		}
		return uniqueChars.size() == 26;
	}
}
