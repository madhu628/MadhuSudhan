package arrays;

public class MergeArrays {
	public static void main(String[] args) {
		int[] a = { 3, 6, 9, 2, 5 };
		int[] b = { 5, 2, 8, 0, 4 };

		int a1 = a.length, b1 = b.length;
		int c1 = a1 + b1;
		int[] c = new int[c1];

		for (int i = 0; i < a1; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b1; i++) {
			c[i + a1] = b[i];
		}
		for (int i = 0; i < c1; i++) {
			System.out.println(c[i]);
		}
	}
}
