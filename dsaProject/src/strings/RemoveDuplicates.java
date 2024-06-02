package Strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
//	public static void main(String[] args) {
//		String s = " madam";
//		char[] a = s.toCharArray();
//		StringBuilder sb = new StringBuilder();
//		for( int i=0;i<s.length();i++) {
//			boolean repeated= false;
//			for(int j=i+1;j<s.length();j++) {
//				if(a[i]==a[j]) {
//					repeated= true;
//					break;
//				}
//				
//			}
//			if(!repeated) {
//				sb.append(a[i]);
//			}
//		}
//		System.out.println(sb);
//	}
	public static void main(String[] args) {
        String s = " madam";
        char[] a = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char c : a) {
            if (!seen.contains(c)) {
                sb.append(c);
                seen.add(c);
            }
        }

        System.out.println(sb.toString());
    }

}
