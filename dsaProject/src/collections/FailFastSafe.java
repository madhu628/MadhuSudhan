package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastSafe {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			// Concurrent modification - throws ConcurrentModificationException
			list.remove(0);
		}

//		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
//		map.put("A", 1);
//		map.put("B", 2);
//		map.put("C", 3);
//
//		Iterator<String> itr = map.keySet().iterator();
//		while (itr.hasNext()) {
//			String key = itr.next();
//			System.out.println(key + " -> " + map.get(key));
//			// Concurrent modification - no exception thrown
//			map.put("D", 4);
//		}
	}
}
