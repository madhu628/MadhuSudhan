package arrays;

import java.util.Arrays;

public class ReverseElemnts {
//	public static void main(String[] args) {
//		int a[] = { 4, 1, 5, 3, 2 };
//		int n = a.length, temp;
//		for (int i = 0; i < n; i++, n--) {
//			temp = a[i];
//			a[i] = a[n - 1];
//			a[n - 1] = temp;
//		}
//		//System.out.println(Arrays.toString(a));
//		for (int i = 0; i < a.length;i++) {
//			System.out.println(a[i]);
//		}
//	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int n = a.length;
		int a1[] = reverse(a, n);
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
//		System.out.println(a1);

	}

	private static int[] reverse(int[] a, int n) {
		int s = 0, e = n - 1;
		while (s < e) {
			int temp = a[s];
			a[s] = a[e];
			a[e] = temp;
			s++;
			e--;
		}
		return a;

	}

}
