package arrays;

public class RemoveDupicatesFromSortedArray {
	public static void main(String[] args) {
		int[] a = { 1, 3, 3, 4, 5, 6, 8, 8, 9 };
		int newLength = removeDuplicates(a);

		// Print the resulting array up to the new length
		for (int i = 0; i < newLength; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static int removeDuplicates(int[] a) {

		if (a.length == 0)
			return 0;

		int c = 0;
		int n = a.length;
		for (int i = 1; i < n; i++) {
			if (a[c] != a[i]) {
				a[c + 1] = a[i];
				c++;
			}
		}
		return c + 1;
	}

}
