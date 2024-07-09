 package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicates {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 4, 5);
		System.out.println(listDuplicateUsingMap(list));
	}

	static List<Integer> listDuplicateUsingMap(List<Integer> list) {
		List<Integer> duplicates = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer num : list) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (int num : map.keySet()) {
			if (map.get(num) > 1) {
				duplicates.add(num);
			}
		}
		return duplicates;
	}

}
