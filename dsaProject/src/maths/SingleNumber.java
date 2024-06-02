package maths;

import java.util.Arrays;

public class SingleNumber {
	public static void main(String[] args) {
		int[] a = { 1, 8, 3, 2 };
		System.out.println(singleNumber(a));
	}

	private static int singleNumber(int[] a) {
		Arrays.sort(a);
		if (a.length == 1) {
			return a[0];
		}
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				return a[i];
			}
		}
		return a[a.length - 1];
	}
}
