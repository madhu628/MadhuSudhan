package streams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSorting {

	public static void main(String[] args) {
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("John", 34);
		unsortedMap.put("Jane", 22);
		unsortedMap.put("Jack", 44);
		unsortedMap.put("Jill", 19);

		// sort based on keys
		Map<String, Integer> sortedByKey = unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		sortedByKey.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

		  System.out.println("*************");
		// sort based on values
		Map<String, Integer> sortedByValue = unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		sortedByValue.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
	}

}
