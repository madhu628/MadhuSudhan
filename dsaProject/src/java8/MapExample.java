package java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] a) {

		Map<String, Integer> map = new HashMap<>();
		map.put("john", 3);
		map.put("warner", 6);
		map.put("smith", 6);
		map.put("adam", 4);

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		System.out.println(entrySet);

		Iterator<Entry<String, Integer>> itr = entrySet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
