package arrays;

public class RemoveDupicatesFromSortedArray {
//	public static void main(String[] args) {
//		int[] a = { 7, 43, 12, 74, 7, 12, 7, 43, 90, 43 };
//		Arrays.sort(a);
//		int newLength = removeDuplicates(a);
//
//		// Print the resulting array up to the new length
//		for (int i = 0; i < newLength; i++) {
//			System.out.print(a[i] + " ");
//		}
//	}
//
//	private static int removeDuplicates(int[] a) {
//
//		if (a.length == 0)
//			return 0;
//
//		int c = 0;
//		int n = a.length;
//		for (int i = 1; i < n; i++) {
//			if (a[c] != a[i]) {
//				a[c + 1] = a[i];
//				c++;
//			}
//		}
//		return c + 1;
//	}

	public static void main(String[] args) {

		int[] a = { 7, 43, 12, 74, 7, 12, 7, 43, 90, 43 };
		int temp = 0, k = 0;
		int[] tempArr = new int[a.length];
		int n = a.length - 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int elem : a) {
			System.out.print(elem + "\t");
		}
		System.out.println();

		for (int i = 0; i < a.length; i++) {
			int val = a[i];
			if (i == a.length - 1) {
				if (!(tempArr[k - 1] == val)) {
					tempArr[k] = val;
				}
				continue;
			}
			if (!(a[i] == a[i + 1])) {
				tempArr[k] = val;
				k++;
			}
		}

		for (int elem : tempArr) {
			if (elem != 0) {
				System.out.print(elem + "\t");
			}
		}

	}

}
