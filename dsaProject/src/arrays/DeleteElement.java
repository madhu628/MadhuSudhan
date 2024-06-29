package arrays;

import java.util.Arrays;

public class DeleteElement {
	public static void main(String[] args) {
		int[] a = { 1, 4, 5, 3, 2, 6 };
		int n = a.length, element = 3;
		boolean found = false; // Flag to check if the element is found
		for (int i = 0; i < n; i++) {
			if (a[i] == element) {
				found = true; // Element found
				for (int j = i; j < n - 1; j++) {
					a[j] = a[j + 1];
				}
				break; // // Break after removing the first occurrence
			}
		}
		if (!found) {
			System.out.println("element not found in the array");
		} else {
			// Print the array after deletion
			for (int i = 0; i < n - 1; i++) {
				System.out.print(a[i] + " ");
			}
		}
	}
//	public static void main(String[] args) {
//
//		int a1[] = { 1, 4, 5, 3, 2, 6 };
//		int[] a2 = new int[a1.length - 1];
//		int element = 3;
//
//		// Loop through the original array and copy elements to the new array
//		for (int i = 0, k = 0; i < a1.length; i++) {
//			if (i != element) {
//				a2[k] = a1[i];
//				k++;
////				If the current index i is not equal to element, it copies the element from a1 to a2 at index k and 
////				then increments k.This effectively skips the element at the specified index.
//			}
//		}
//		// Print the new array
//		System.out.println(Arrays.toString(a2));
//
//	}

//	public static void main(String[] args) {
//		int a[] = { 1, 4, 5, 3, 2, 6 };
//		int n = a.length, pos = 3;
//		if (pos >= n + 1) {
//			System.out.println("not possible");
//		} else {
//			for (int i = pos - 1; i < n - 1; i++) {
////				 shifts the elements to the left starting from the specified position 
////				 (pos - 1, which converts the 1-based index to a 0-based index).
//				a[i] = a[i + 1];
//
//			}
//		}
//		for (int i = 0; i < n - 1; i++) {
//			System.out.println(a[i]);
//		}
//	}
}
