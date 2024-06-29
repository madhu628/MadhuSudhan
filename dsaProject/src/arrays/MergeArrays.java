package arrays;

public class MergeArrays {
	public static void main(String[] args) {
		int[] a = { 3, 6, 9, 2, 5 };
		int[] b = { 5, 2, 8, 0, 4 };

		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i];
		}

		// Merge arrays using System.arraycopy()
//        System.arraycopy(a, 0, c, 0, a1);
//        System.arraycopy(b, 0, c, a1, b1);

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

		// Print the merged array
//		System.out.println(Arrays.toString(c));
	}
}
