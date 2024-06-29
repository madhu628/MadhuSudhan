package arrays;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		// using streams
		int sum1 = Arrays.stream(arr).sum();
		System.out.println(sum1);

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
