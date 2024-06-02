package strings;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class NonRepeatCharacters {
//	public static void main(String[] args) {
//		String s= "AABCDBE";
//		Map<Character, Integer> mp = new HashMap<>();
//		for(int i=0;i<s.length();i++) {
//			char ch = s.charAt(i);
//			if(mp.containsKey(ch)) {
//				mp.put(ch, mp.get(ch)+1);
//			}else {
//				mp.put(ch, 1);
//			}
//		}
//		for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
//			if(entry.getValue()==1) {
//				System.out.println(entry.getKey());
//				break;
//			}
//		}
//	}
	
	public static void main(String[] args) {
		String s= "AABCDBE";
		Map<Character, Integer> mp = new HashMap<>();
		char[] a = s.toCharArray();
 		for(Character ch :a) {
			if(mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch)+1);
			}else {
				mp.put(ch, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}
