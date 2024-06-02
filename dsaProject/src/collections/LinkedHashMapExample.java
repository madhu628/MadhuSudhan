package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
		hm.put(10, "Sachin");
		hm.put(18, "Kohli");
		hm.put(7, "Dhoni");
		hm.put(19, "Dravid");
		System.out.println("map: " + hm);

		System.out.println("***************************");
		Set s = hm.keySet(); // Retrieves keys from Map
		System.out.println("keys: " + s);

		System.out.println("***************************");
		Collection c = hm.values(); // Retrieves values from Map
		System.out.println("values: " + c);

		System.out.println("***************************");
		Set mapData = hm.entrySet(); // To get the Key,Value from Map as set need to use entrySet() method
		System.out.println("mapData as Set :" + mapData);

		System.out.println("***************************");
		Iterator itr = mapData.iterator();
		while (itr.hasNext()) {
			Entry data = (Entry) itr.next();
			System.out.println(data.getKey() + ":" + data.getValue());
		}

	}

}
