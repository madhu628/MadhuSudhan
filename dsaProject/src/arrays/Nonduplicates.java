package arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Nonduplicates {

//	public static void main(String[] args) {
//
//		int[] a = { 3, 7, 9, 2, 5, 1, 8, 8 };
//		Arrays.sort(a);
//		int n = a.length;
//		for (int i = 0; i < n; i++) {
//			boolean flag = false;
//			for (int j = 0; j < i; j++) {
//				if (a[i] == a[j]) {
//					flag = true;
//					break;
//				}
//
//			}
//			if (!flag) {
//				System.out.println(a[i]);
//			}
//
//		}
//
//	}

	public static void main(String[] args) {
		int[] a = { 3, 7, 9, 2, 5, 1, 8, 8 };
		printUniqueSortedElements(a);
	}

	private static void printUniqueSortedElements(int[] a) {
		// Sort the array
		Arrays.sort(a);

		// Use LinkedHashSet to maintain order of insertion
		Set<Integer> uniqueElements = new LinkedHashSet<>();

		// Add elements to the set, duplicates will be ignored
		for (int num : a) {
			uniqueElements.add(num);
		}

		// Print unique sorted elements
		for (int num : uniqueElements) {
			System.out.println(num);
		}
	}

}
