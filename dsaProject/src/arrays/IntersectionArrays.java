package arrays;

import java.util.Arrays;

public class IntersectionArrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 5 }; //// Extend the array to fit the merged result
		int[] arr2 = { 2, 4, 3, 7, 9 };
		int[] temp = new int[Math.min(arr1.length, arr2.length)];
		int k = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					temp[k++] = arr1[i];
					break;
				}
			}
		}
		System.out.println(Arrays.toString(temp));

	}

}
