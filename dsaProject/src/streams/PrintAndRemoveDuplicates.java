package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintAndRemoveDuplicates {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(100, 32, 76, 11, 22, 56, 22, 4, 32, 11, 1);

		Set<Integer> seen = new HashSet<>();

		//print duplicates using hashset
		 //integers.stream().filter(n -> !seen.add(n)).forEach(System.out::println);

		System.out.println();

		//remove duplicates or print unique
		//integers.stream().filter(n -> seen.add(n)).forEach(System.out::println);
		
		//print duplicates using hashmap
		Map<Integer, Long> frequencyMap = integers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		
		frequencyMap.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey()));//output 32,22,11
		
		frequencyMap.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).forEach(System.out::println);

		//print unique
		 //integers.stream().distinct().forEach(System.out::println);
		 
//		 System.out.println();
//
//		Map<Integer, Long> frequencyMap1 = integers.stream()
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//		// Print unique elements
//		frequencyMap1.entrySet().stream().filter(entry -> entry.getValue() == 1)
//				.forEach(entry -> System.out.println(entry.getKey()));

	}

}
