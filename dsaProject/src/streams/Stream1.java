package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 6, 1, 7, 9, 0, 2);
		// System.out.println(listDuplicateUsingCollectionsFrequency(list));
		System.out.println(listDuplicateUsingFilterAndSetAdd(list));
	}

	// static List<Integer> listDuplicateUsingCollectionsFrequency(List<Integer>
	// list) {
//	    List<Integer> duplicates = new ArrayList<>();
//	    Set<Integer> set = list.stream()
//	      .filter(i -> Collections.frequency(list, i) > 1)
//	      .collect(Collectors.toSet());
//	    duplicates.addAll(set);
//	    return duplicates;
//	}

	static List<Integer> listDuplicateUsingFilterAndSetAdd(List<Integer> list) {
		Set<Integer> elements = new HashSet<Integer>();
		return list.stream().filter(n -> !elements.add(n)).collect(Collectors.toList());
	}

}
