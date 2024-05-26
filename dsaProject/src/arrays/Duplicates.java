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
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (Integer number : list) {
			frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
		}
		for (int number : frequencyMap.keySet()) {
			if (frequencyMap.get(number) != 1) {
				duplicates.add(number);
			}
		}
		return duplicates;
	}

}
