package arrays;

import java.util.Arrays;

public class UnionArrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 5 }; //// Extend the array to fit the merged result
		int[] arr2 = { 2, 4, 6, 7, 9 };

		int[] temp = new int[arr1.length + arr2.length];
		int k = 0;
		for (int i = 0; i < arr1.length; i++) {
			temp[k++] = arr1[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			boolean found = false;
			for (int i = 0; i < arr1.length; i++) {
				if (arr2[j] == arr1[i]) {
					found = true;
					break;
				}
			}
			if (!found) {
				temp[k++] = arr2[j];
			}
		}
		System.out.println(Arrays.toString(temp));
	}
}
