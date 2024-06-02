package strings;

import java.util.HashMap;
import java.util.Map;

public class OccrenceInString {
//	public static void main(String[] args) {
//		String s = "hello";
//		Map<Character, Integer> mp = new HashMap<>();
//		char[] a = s.toCharArray();
//		for(Character c:a) {
//			if(mp.containsKey(c)) {
//				mp.put(c, mp.get(c)+1);
//			}else {
//				mp.put(c, 1);
//			}
//		}
//		System.out.println(mp);
//	}
	public static void main(String[] args) {
		String s = "hello";
		Map<Character, Integer> mp = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch)+1);
			}else {
				mp.put(ch, 1);
			}
		}
		System.out.println(mp);
	}

}
