package arrays;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int a[] = { 3, 8, 0, 4, 2, 7, 3 };
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
//		for (int i = 0; i < n; i++) {
//
//			System.out.println(a[i]);
//		}
	}
}
