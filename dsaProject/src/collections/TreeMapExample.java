package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap<Integer, String> hm = new TreeMap<>();
		hm.put(10, "Sachin");
		hm.put(18, "Kohli");
		hm.put(7, "Dhoni");
		hm.put(19, "Dravid");
//		hm.put(null,"Charan"); // It won't allow NullPointerException it will throw
//		hm.put(21,null);   // It will accept this.
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
			Map.Entry data = (Map.Entry) itr.next();
			System.out.println(data.getKey() + ":" + data.getValue());
		}

	}

}
