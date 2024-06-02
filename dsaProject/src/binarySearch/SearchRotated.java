//search rotated and sorted array
package binarySearch;

public class SearchRotated {
	public static void main(String[] args) {
		int[] a = { 7, 9, 1, 2, 3 };
		int n = a.length;
		int k = 9;
		System.out.println(findPos(a, n, k));

	}

	private static char[] findPos(int[] a, int n, int k) {
		int pivot = pivot(a, n);
		if (k >= a[pivot] && k <= a[n - 1]) {
			return BS(a, pivot, n - 1, k);
		} else {
			return BS(a, 0, pivot - 1, k);
		}
	}

	private static char[] BS(int[] a, int pivot, int i, int k) {
		
		return null;
	}

	private static int pivot(int[] a, int n) {
		// TODO Auto-generated method stub
		return 0;
	}

	return null;
}
