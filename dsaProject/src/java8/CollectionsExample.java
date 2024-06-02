package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionsExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(1);
		list.add(500);
		list.add(10);
		list.add(25);
		System.out.println("******** Through normal for loop **********");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("** Through For-Each Loop ******");
		for (Integer i : list) {
			System.out.println(i);
		}

		System.out.println("**** Through iterataor in ascending order ******");
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("**** Through Lst Iterator in decending order *****");
		ListIterator<Integer> litr = list.listIterator(list.size());
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

		System.out.println("*** Through Streams *****");
		list.stream().forEach(t -> System.out.println(t));

		System.out.println("Sorted");
		List<Integer> sortedList = new ArrayList<>();
		list.stream().sorted().forEach(t -> sortedList.add(t));
		System.out.println("***maximum element in a collection *****");
		System.out.println(sortedList.get(sortedList.size() - 1));

		System.out.println("****** Enumeration Through Vector *****");
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(188);
		v.add(null);
		v.add(0);

		Enumeration<Integer> e = v.elements();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		System.out.println("***************");
		int[] values = { 1, 500, 27, 7, 2, 27, 89, 56, 500, 253 };
		List<String> strngValues = Arrays.asList("AA", "BB", "CC", "AA", "DD", "CC");

		Map<String, Long> sortedMap = strngValues.stream().filter(key -> Collections.frequency(strngValues, key) >= 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(sortedMap);
		System.out.println("**********************");

		String[] stringArr = { "AA", "BB", "CC", "AA", "DD", "CC" };
		List<String> ListOfStrngs = Arrays.asList(stringArr);
		Map<String, Long> sortedMapOfStrings = Arrays.stream(stringArr)
				.filter(word -> Collections.frequency(ListOfStrngs, word) >= 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(sortedMapOfStrings);
		System.out.println("*********************");

		Set<String> entries = sortedMapOfStrings.keySet();
		Iterator<String> iterator = entries.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Long value = sortedMapOfStrings.get(key);
			if (value == 1)
				System.out.println(key);
		}
		
		System.out.println("*********************");

		Map<String, Integer> myMap = new HashMap<>();
		for (int i = 0; i < stringArr.length; i++) {
			String key = stringArr[i];
			if (myMap.containsKey(key)) {
				int value = myMap.get(key) + 1;
				myMap.put(key, value);
			} else {
				myMap.put(key, 1);
			}
		}
		System.out.println("My Map:" + myMap);
		
		System.out.println("***************");
		Set<String> myMapKeys = myMap.keySet();
		for (String str : myMapKeys) {
			if (myMap.get(str) == 1) {
				System.out.println("Key:" + str + "\t count is :" + myMap.get(str));
			}
		}
		System.out.println("*********************");

		Set<Map.Entry<String, Integer>> entrySetValues = myMap.entrySet();
		Iterator<Map.Entry<String, Integer>> iter = entrySetValues.iterator();
		while (iter.hasNext()) {
			Map.Entry<String, Integer> data = (Entry<String, Integer>) iter.next();
			if (data.getValue() == 1) {
				System.out.println(data.getKey() + "\t" + data.getValue());
			}
		}

	}

}
