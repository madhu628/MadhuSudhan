package arrays;

import java.util.Arrays;

public class Nonduplicates {

	public static void main(String[] args) {

		int[] a = { 3, 7, 9, 2, 5, 1, 8, 8 };
		Arrays.sort(a);
		int n = a.length;
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					flag = true;
					break;
				}

			}
			if (!flag) {
				System.out.println(a[i]);
			}

		}

	}

}
