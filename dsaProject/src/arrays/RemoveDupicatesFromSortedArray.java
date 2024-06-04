package arrays;

import java.util.Arrays;

public class RemoveDupicatesFromSortedArray {
//	public static void main(String[] args) {
//		int[] a = { 7, 43, 12, 74, 7, 12, 7, 43, 90, 43 };
//		int n = a.length;
//		Arrays.sort(a);
//		int newLength = removeDuplicates(a, n);
//
//		// Print the resulting array up to the new length
//		for (int i = 0; i < newLength; i++) {
//			System.out.print(a[i] + " ");
//		}
//	}
//
//	private static int removeDuplicates(int[] a, int n) {
//
//		if (a.length == 0)
//			return 0;
//
//		int uniqueIndex = 0;
//
//		for (int i = 1; i < n; i++) {
//			if (a[uniqueIndex] != a[i]) {   //if not equals a new unique element has been found.
//				uniqueIndex++;
//				a[uniqueIndex ] = a[i];
//			}
//		}
//		return uniqueIndex + 1;
//	}

	public static void main(String[] args) {

		int[] a = { 7, 43, 12, 74, 7, 12, 7, 43, 90, 43 };
		int n = a.length;

		// Sort the array using Arrays.sort
		Arrays.sort(a);

//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n - i; j++) {
//				if (a[j] > a[j + 1]) {
//					temp = a[j];
//					a[j] = a[j + 1];
//					a[j + 1] = temp;
//				}
//			}
//		}
//      // Print the sorted array
		for (int elem : a) {
			System.out.print(elem + "\t");
		}
		System.out.println();

		// Removing duplicates from the sorted array
		int[] tempArr = new int[a.length];
		int k = 0;

		// Add the first element to tempArr
		if (a.length > 0) {
			tempArr[k++] = a[0];
		}

		for (int i = 1; i < n; i++) {
			if ((a[i] != a[i - 1])) {
				tempArr[k++] = a[i];
			}
		}

		// Print the array without duplicates
//		for (int elem : tempArr) {
//			if (elem != 0) {
//				System.out.print(elem + "\t");
//			}
//		}

		for (int i = 0; i < k; i++) {
			System.out.print(tempArr[i] + "\t");
		} 

	}

}
