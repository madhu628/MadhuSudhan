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
		reverse(a, n);

		// Print the reversed array
		for (int element : a) {
			System.out.print(element + " ");
		}

//		for (int i = 0; i < a1.length; i++) {
//			System.out.println(a1[i]);
//		}
//		System.out.println(a1);

	}

	private static void reverse(int[] a, int n) {
		int s = 0, e = n - 1;

		// Swap elements from the start and end until the middle is reached
		while (s < e) {
			int temp = a[s];
			a[s] = a[e];
			a[e] = temp;
			s++;
			e--;
		}

	}

}
