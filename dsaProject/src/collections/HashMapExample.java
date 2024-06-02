package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(10, "Sachin");
		hm.put(18, "Kohli");
		hm.put(7, "Dhoni");
		hm.put(19, "Dravid");
		System.out.println("map: " + hm);

		System.out.println("***************************");
		Set<Integer> s = hm.keySet(); // Retrieves keys from Map
		System.out.println("keys: " + s);

		System.out.println("***************************");
		Collection<String> c = hm.values(); // Retrieves values from Map
		System.out.println("values: " + c);

		System.out.println("***************************");
		Set<?> mapData = hm.entrySet(); // To get the Key,Value from Map as set need to use entrySet() method
		System.out.println("mapData as Set :" + mapData);

		System.out.println("***************************");
		Iterator<?> itr = mapData.iterator();
		while (itr.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry data = (Map.Entry) itr.next();
			System.out.println(data.getKey() + ":" + data.getValue());
		}

	}

}
